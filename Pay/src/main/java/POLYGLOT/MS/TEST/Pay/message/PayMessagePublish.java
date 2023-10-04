package POLYGLOT.MS.TEST.Pay.message;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import POLYGLOT.MS.TEST.Pay.model.PayModel;

@Component
public class PayMessagePublish {

    @Value("${spring.kafka.template.default-topic}")
    String topicName;

    // private Logger log = LoggerFactory.getLogger(PayMessagePublish.class);

    @Autowired
    KafkaTemplate<Integer, String> kafkaTemplate;

    @Autowired
    ObjectMapper objectMapper;

    public void sendDepositEvent(PayModel payModel) throws JsonProcessingException {

        String value = objectMapper.writeValueAsString(payModel);
        kafkaTemplate.send(topicName, value);
    }

}
