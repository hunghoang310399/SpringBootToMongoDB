package Demo.Domain;

import Demo.Model.Service;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ServiceReponsitory extends MongoRepository<Service,String> {

}
