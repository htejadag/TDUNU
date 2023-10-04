package POLYGLOT.MS.TEST.Pay.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import POLYGLOT.MS.TEST.Pay.dto.PayRequest;
import POLYGLOT.MS.TEST.Pay.message.PayMessagePublish;
import POLYGLOT.MS.TEST.Pay.model.PayModel;
import POLYGLOT.MS.TEST.Pay.service.IPayService;

@RestController
@RequestMapping("/api/pay")
public class PayController {

        @Autowired
        IPayService payService;

        @Autowired
        PayMessagePublish messageEvent;

        Logger logger = LoggerFactory.getLogger(PayController.class);

        @PostMapping("/register")
        public ResponseEntity<?> register(@RequestBody PayRequest request) throws Exception {

                logger.info("Post: InvoiceId {} - Ammount {}", request.getId_invoice(), request.getAmount());
                PayModel payModel = new PayModel();
                payModel.setId_invoice(request.getId_invoice());
                payModel.setAmount(request.getAmount());
                payModel = payService.add(payModel);
                logger.info("transactionModel {}", payModel);
                messageEvent.sendDepositEvent(payModel);                
                return ResponseEntity.status(HttpStatus.CREATED).body(payModel);
        }

}
