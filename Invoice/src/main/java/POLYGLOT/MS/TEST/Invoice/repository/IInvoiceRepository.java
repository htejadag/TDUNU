package POLYGLOT.MS.TEST.Invoice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import POLYGLOT.MS.TEST.Invoice.model.InvoiceModel;


@Repository
public interface IInvoiceRepository extends CrudRepository<InvoiceModel,Integer> {
   
}



