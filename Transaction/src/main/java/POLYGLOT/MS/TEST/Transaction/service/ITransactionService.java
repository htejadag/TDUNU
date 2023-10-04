package POLYGLOT.MS.TEST.Transaction.service;

import POLYGLOT.MS.TEST.Transaction.model.TransactionModel;

public interface ITransactionService {
    public TransactionModel add (TransactionModel transaction);
    public Iterable<TransactionModel> findByIdInvoice (Integer id_invoice);
	public Iterable<TransactionModel>  findAll() ;
}