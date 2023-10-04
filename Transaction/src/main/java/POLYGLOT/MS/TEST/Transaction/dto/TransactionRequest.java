package POLYGLOT.MS.TEST.Transaction.dto;

public class TransactionRequest {
    
    private Integer id_transaction;    
    private Integer id_operation;
    private Integer id_invoice;
	private double amount;
    private String date;    
    
    public Integer getId_transaction() {
        return id_transaction;
    }
    public void setId_transaction(Integer id_transaction) {
        this.id_transaction = id_transaction;
    }
    public Integer getId_operation() {
        return id_operation;
    }
    public Integer getId_invoice() {
        return id_invoice;
    }
    public void setId_invoice(Integer accountId) {
        this.id_invoice = accountId;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String creationDate) {
        this.date = creationDate;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setId_operation(Integer id) {
        this.id_operation = id;
    }
}