package POLYGLOT.MS.TEST.Transaction.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import POLYGLOT.MS.TEST.Transaction.model.TransactionModel;
import POLYGLOT.MS.TEST.Transaction.repository.ITransactionRepository;

@CacheConfig(cacheNames = "transaction")
@Service
public class TransactionService implements ITransactionService {

	Logger logger = LoggerFactory.getLogger(TransactionService.class);

	@Autowired
	ITransactionRepository transactionRepository;

	@Override
	public TransactionModel add(TransactionModel transaction) {
		return transactionRepository.save(transaction);
	}

	@Override
	@Cacheable(cacheNames = { "transaction" }, key = "#id_invoice")
	public List<TransactionModel> findByIdInvoice(Integer id_invoice) {
		logger.info("SERVICE: Get Find By id_invoice: {}", id_invoice);
		return (List<TransactionModel>) transactionRepository.findByIdInvoice(id_invoice);
	}

	@Override
	public Iterable<TransactionModel> findAll() {
		return transactionRepository.findAll();
	}

}