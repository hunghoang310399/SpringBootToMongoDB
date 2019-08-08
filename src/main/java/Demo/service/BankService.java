package Demo.service;

import Demo.Model.Bank;
import Demo.Domain.BankReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BankService {
    @Autowired
    private BankReponsitory bankRepons;
    //Bank
    public ServiceResult getAllBank(){
        ServiceResult result = new ServiceResult();
        result.setData(bankRepons.findAll());
        return result;
    }
    public ServiceResult getIDBank(String id ){
        ServiceResult result = new ServiceResult();

        Bank bank = bankRepons.findById(id).orElse(null);
        result.setData(bank);
        return result;
    }
    public ServiceResult  createBank(Bank bank)
    {
        ServiceResult result = new ServiceResult();
        result.setData(bankRepons.save(bank));
        return result;
    }
    public ServiceResult updateBank(Bank bank)
    {
        ServiceResult result = new ServiceResult();
        if (!bankRepons.findById(bank.getId()).isPresent()) {
            result.setStatus(ServiceResult.Status.FAILED);
            result.setMessage("Not Found");
        } else {

            result.setData(bankRepons.save(bank));
        }
        return result;
    }
    public ServiceResult deleteBank(String id ){
        ServiceResult result = new ServiceResult();
        Bank bank = bankRepons.findById(id).orElse(null);
        if (bank == null) {
            result.setStatus(ServiceResult.Status.FAILED);
            result.setMessage("Not Found");
        } else {
            bankRepons.delete(bank);
            result.setMessage("success");
        }
        return result;
    }




}
