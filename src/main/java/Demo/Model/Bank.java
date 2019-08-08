package Demo.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "bank")
public class Bank implements Serializable {
    @Id
    private String id;
    private String namebank;
    private String abbreviations;
    private String address;
    private String phone;
    private String email;
    private String delete;
    public Bank(String id, String namebank, String abbreviations, String address, String phone, String email) {
        this.id = id;
        this.namebank = namebank;
        this.abbreviations = abbreviations;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamebank() {
        return namebank;
    }

    public void setNamebank(String namebank) {
        this.namebank = namebank;
    }

    public String getAbbreviations() {
        return abbreviations;
    }

    public void setAbbreviations(String abbreviations) {
        this.abbreviations = abbreviations;
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }
}
