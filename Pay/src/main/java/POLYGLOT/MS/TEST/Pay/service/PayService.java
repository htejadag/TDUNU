package POLYGLOT.MS.TEST.Pay.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import POLYGLOT.MS.TEST.Pay.model.PayModel;
import POLYGLOT.MS.TEST.Pay.repository.IPayRepository;
 
import jakarta.transaction.Transactional;
 
@Service
public class PayService  implements IPayService {
 
    @Autowired
    private IPayRepository payRepositoy;
 
    @Override
    @Transactional
    public PayModel add(PayModel payModel) {
        return payRepositoy.save(payModel);
    }
   
}
