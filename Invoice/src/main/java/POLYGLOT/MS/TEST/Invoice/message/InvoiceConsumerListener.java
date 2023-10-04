package POLYGLOT.MS.TEST.Invoice.message;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POLYGLOT.MS.TEST.Invoice.dto.InvoiceRequest;
import POLYGLOT.MS.TEST.Invoice.model.InvoiceModel;
import POLYGLOT.MS.TEST.Invoice.service.InvoiceService;

@Component
public class InvoiceConsumerListener {

    private Logger log = LoggerFactory.getLogger(InvoiceConsumerListener.class);

    @Autowired
    InvoiceService service;

    @KafkaListener(topics = "${spring.kafka.template.default-topic}")
    public void OnMessage(ConsumerRecord<Integer, String> consumerRecord)
            throws JsonMappingException, JsonProcessingException {
        log.info("****************************************************************");
        log.info("ConsumerRecord : {}", consumerRecord.value());

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonMessage = consumerRecord.value();
        InvoiceRequest data = objectMapper.readValue(jsonMessage, InvoiceRequest.class);

        InvoiceModel model = service.findById(data.getId_invoice());

        if (model.getAmount() == data.getAmount()) {
            model.setState(2);
        }

        service.update(model);

    }
}
