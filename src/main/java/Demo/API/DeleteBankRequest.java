package Demo.API;

import org.springframework.data.mongodb.core.mapping.Document;


public class DeleteBankRequest {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
