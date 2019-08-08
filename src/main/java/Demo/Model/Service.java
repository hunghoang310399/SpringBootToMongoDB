package Demo.Model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class Service implements Serializable {
    @Id
    private String id;
    private String NameService;

    public Service(String id, String nameService) {
        this.id = id;
        NameService = nameService;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return NameService;
    }

    public void setNameService(String nameService) {
        NameService = nameService;
    }
}
