package Demo.service;
import Demo.Model.Product;
import Demo.Domain.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List getProducts() {
        return repository.findAll();
    }
    public Object getId(String id ){
        Product product = repository.findById(id).orElse(null);
        return product;
    }

}
