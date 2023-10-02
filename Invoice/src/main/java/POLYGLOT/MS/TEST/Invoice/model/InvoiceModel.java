package POLYGLOT.MS.TEST.Invoice.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Invoice")
public class InvoiceModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_invoice")
    private Integer id_invoice;

    @Column(name = "amount")
    private double amount;

    @Column(name = "state")
    private Integer state;

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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}
