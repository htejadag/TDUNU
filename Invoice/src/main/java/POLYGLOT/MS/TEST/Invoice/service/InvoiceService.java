package POLYGLOT.MS.TEST.Invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import POLYGLOT.MS.TEST.Invoice.model.InvoiceModel;
import POLYGLOT.MS.TEST.Invoice.repository.IInvoiceRepository;
 
import jakarta.transaction.Transactional;
 
@Service
public class InvoiceService implements IInvoiceService {
 
    @Autowired
    IInvoiceRepository invoiceRepository;
 
    @Override
    public List<InvoiceModel> findAll() {
        return  (List<InvoiceModel>)invoiceRepository.findAll();
    }
 
    @Override
    @Transactional
    public InvoiceModel update(InvoiceModel accountModel) {
        return invoiceRepository.save(accountModel);
    }
 
    @Override
    public InvoiceModel findById(Integer id) {
        return invoiceRepository.findById(id).orElse(null);
    }
   
}



