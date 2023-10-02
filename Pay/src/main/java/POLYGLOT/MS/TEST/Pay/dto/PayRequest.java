package POLYGLOT.MS.TEST.Pay.dto;
 
import java.io.Serializable;
 
public class PayRequest implements Serializable {
 
    private static final long serialVersionUID = 1L;
    private Integer id_invoice;
    private double amount;
 
    public PayRequest() {
 
    }
 
    public PayRequest(Integer accountId, double amount) {
        this.setId_invoice(accountId);
        this.setAmount(amount);
    }
 
    public Integer getId_invoice() {
        return id_invoice;
    }
 
    public double getAmount() {
        return amount;
    }
 
    public void setAmount(double amount) {
        this.amount = amount;
    }
 
    public void setId_invoice(Integer accountId) {
        this.id_invoice = accountId;
    }
}



