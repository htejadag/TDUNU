package POLYGLOT.MS.TEST.Security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
import POLYGLOT.MS.TEST.Security.model.AccessModel;
 
@Repository
public interface IAuthRepository extends CrudRepository<AccessModel, Long> {
   
}



