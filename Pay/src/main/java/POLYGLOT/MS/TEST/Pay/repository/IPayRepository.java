package POLYGLOT.MS.TEST.Pay.repository;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
import POLYGLOT.MS.TEST.Pay.model.PayModel;
 
@Repository
public interface IPayRepository extends CrudRepository<PayModel, Long>{
   
}

