package POLYGLOT.MS.TEST.Invoice.service;
 
import java.util.List;
 
import POLYGLOT.MS.TEST.Invoice.model.InvoiceModel;
 
public interface IInvoiceService {
   
    public List<InvoiceModel> findAll();
    public InvoiceModel findById (Integer id);
    public InvoiceModel update(InvoiceModel invoiceModel);
}



