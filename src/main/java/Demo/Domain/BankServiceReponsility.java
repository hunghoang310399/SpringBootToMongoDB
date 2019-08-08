package Demo.Domain;

import Demo.Model.ServiceOfBank;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BankServiceReponsility extends MongoRepository<ServiceOfBank,String> {
}
