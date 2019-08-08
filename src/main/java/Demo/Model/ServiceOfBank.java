package Demo.Model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class ServiceOfBank implements Serializable {
    @Id
    private String id;
    private  String id_bank;
    private  String id_service;

    public ServiceOfBank(String id, String id_bank, String id_service) {
        this.id = id;
        this.id_bank = id_bank;
        this.id_service = id_service;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_bank() {
        return id_bank;
    }

    public void setId_bank(String id_bank) {
        this.id_bank = id_bank;
    }

    public String getId_service() {
        return id_service;
    }

    public void setId_service(String id_service) {
        this.id_service = id_service;
    }
}
