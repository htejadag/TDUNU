package POLYGLOT.MS.TEST.Transaction.message;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POLYGLOT.MS.TEST.Transaction.dto.TransactionRequest;
import POLYGLOT.MS.TEST.Transaction.model.TransactionModel;
import POLYGLOT.MS.TEST.Transaction.service.TransactionService;

@Component
public class TransactionConsumerListener {
    private Logger log = LoggerFactory.getLogger(TransactionConsumerListener.class);

    @Autowired
    TransactionService service;

    @KafkaListener(topics = "${spring.kafka.template.default-topic}")
    public void OnMessage(ConsumerRecord<Integer, String> consumerRecord)
            throws JsonMappingException, JsonProcessingException {
        log.info("****************************************************************");
        log.info("ConsumerRecord : {}", consumerRecord.value());

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonMessage = consumerRecord.value();
        TransactionRequest data = objectMapper.readValue(jsonMessage, TransactionRequest.class);

        TransactionModel model = new TransactionModel();
        model.setId_transaction(data.getId_operation());
        model.setId_invoice(data.getId_invoice());
        model.setAmount(data.getAmount());
        model.setDate(data.getDate());

        log.info("Register Transaction {} ", data.getId_operation());
        service.add(model);

        log.info("****************************************************************");
    }

}
