package POLYGLOT.MS.TEST.Pay.model;
 
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "operation")
public class PayModel implements Serializable {
 
    private static final long serialVersionUID = 1L;
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_operation;

    @Column(name = "id_invoice")
    private Integer id_invoice;

    private double amount;

    @Column(name = "date")
    private String date;
 
    public PayModel() {
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
        this.setDate(dateFormat.format(date));
    }    

    public Integer getId_operation() {
        return id_operation;
    }

    public void setId_operation(Integer id_operation) {
        this.id_operation = id_operation;
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

