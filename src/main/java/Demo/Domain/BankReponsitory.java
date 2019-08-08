package Demo.Domain;

import Demo.Model.Bank;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BankReponsitory extends MongoRepository<Bank ,String> {
}
