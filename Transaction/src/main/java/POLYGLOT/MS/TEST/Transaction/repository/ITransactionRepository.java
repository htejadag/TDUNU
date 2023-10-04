package POLYGLOT.MS.TEST.Transaction.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import POLYGLOT.MS.TEST.Transaction.model.TransactionModel;

@Repository
public interface ITransactionRepository extends MongoRepository<TransactionModel, String>  {
   
	@Query("{'id_invoice':?0}")
	public Iterable<TransactionModel> findByIdInvoice(Integer id_invoice);
}