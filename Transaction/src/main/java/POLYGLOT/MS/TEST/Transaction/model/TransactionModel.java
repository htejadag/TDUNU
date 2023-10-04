package POLYGLOT.MS.TEST.Transaction.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transaction")
public class TransactionModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @BsonId
    private String id;

    private Integer id_transaction;

    private Integer id_invoice;

    private double amount;

    private String date;

    public TransactionModel() {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        this.setDate(dateFormat.format(date));
    }

    public String getDate() {
        return date;
    }

    public void setDate(String creationDate) {
        this.date = creationDate;
    }

    public Integer getId_transaction() {
        return id_transaction;
    }

    public void setId_transaction(Integer idtransaction) {
        this.id_transaction = idtransaction;
    }

    public Integer getId_invoice() {
        return id_invoice;
    }

    public void setId_invoice(Integer accountId) {
        this.id_invoice = accountId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}