package POLYGLOT.MS.TEST.Transaction.dto;

public class TransactionRequest {
    
    private Integer id;
	private double amount;
	private String type;
    private String creationDate;
    private Integer accountId;
    
    public Integer getId() {
        return id;
    }
    public Integer getAccountId() {
        return accountId;
    }
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
    public String getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}