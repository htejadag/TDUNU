package POLYGLOT.MS.TEST.Invoice.dto;

public class InvoiceRequest {

    private Integer id_operation;
    private Integer id_invoice;    
    private double amount;
    private String date;

    public Integer getId_operation() {
        return id_operation;
    }
    public void setId_operation(Integer id) {
        this.id_operation = id;
    }
    public Integer getId_invoice() {
        return id_invoice;
    }
    public void setId_invoice(Integer id_invoice) {
        this.id_invoice = id_invoice;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    
}
