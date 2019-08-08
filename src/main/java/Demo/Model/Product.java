package Demo.Model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
public class Product implements Serializable {
    @Id
    private String id;
    private String name ;
    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }


}
