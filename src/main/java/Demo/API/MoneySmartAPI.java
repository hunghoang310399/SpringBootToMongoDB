package Demo.API;
import Demo.Model.Bank;
import Demo.service.BankService;
import Demo.service.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping(value = "/api")
public class MoneySmartAPI {
    @Autowired
    private BankService bankService;
    @PostMapping(value = "/banks")
    public ResponseEntity<ServiceResult> create(@RequestBody Bank bank) {
        return new ResponseEntity<ServiceResult>(bankService.createBank(bank), HttpStatus.OK);
    }
    @GetMapping(value = "/banks")
    public ResponseEntity<ServiceResult> findAllBank(){
        return new ResponseEntity<ServiceResult>(bankService.getAllBank(), HttpStatus.OK);
    }
    @GetMapping(value = "/banks/{id}")
    public ResponseEntity<ServiceResult> findById(@PathVariable String id) {
        return new ResponseEntity<ServiceResult>(bankService.getIDBank(id), HttpStatus.OK);
    }
    @PutMapping(value = "/banks")
    public ResponseEntity<ServiceResult> update(@RequestBody Bank bank) {
        return new ResponseEntity<ServiceResult>(bankService.updateBank(bank), HttpStatus.OK);
    }
    @DeleteMapping(value = "/banks")
    public ResponseEntity<ServiceResult> delete(@RequestBody DeleteBankRequest request) {
        return new ResponseEntity<ServiceResult>(bankService.deleteBank(request.getId()), HttpStatus.OK);
    }

}
