package POLYGLOT.MS.TEST.Transaction.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import POLYGLOT.MS.TEST.Transaction.model.TransactionModel;
import POLYGLOT.MS.TEST.Transaction.service.ITransactionService;

@RestController
@RequestMapping("/api/transaction")
public class TransactionController {

	@Autowired
	ITransactionService transactionService;
	Logger logger = LoggerFactory.getLogger(TransactionController.class);

	@GetMapping("listar")
	public List<TransactionModel> listar() {
		logger.info("CONTROLLER: TransactionModel");
		return (List<TransactionModel>) transactionService.findAll();
	}

	@GetMapping("/{id_invoice}")
	public ResponseEntity<?> getByIdInvoice(@PathVariable Integer id_invoice) {

		logger.info("CONTROLLER: Get By id_invoice: {}", id_invoice);

		Iterable<TransactionModel> transaction = transactionService.findByIdInvoice(id_invoice);
		return ResponseEntity.ok(transaction);
	}

}