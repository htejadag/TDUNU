package POLYGLOT.MS.TEST.Invoice.controller;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import POLYGLOT.MS.TEST.Invoice.model.InvoiceModel;
import POLYGLOT.MS.TEST.Invoice.service.IInvoiceService;
 
@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {
   
    @Autowired
    private IInvoiceService accountService;
   
    @GetMapping()
    public List<InvoiceModel> get() {
        return accountService.findAll();
    }
}

