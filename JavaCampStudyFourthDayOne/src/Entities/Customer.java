package Entities;



import java.time.LocalDate;
import java.util.Date;

public class Customer implements IEntity {

    private int id;
    private String firstName;
    private String lastname;
    private LocalDate dateOfBirth;
    
    private  String naitonalityId;

    public Customer(int id, String firstName, String lastname, LocalDate dateOfBirth, String naitonalityId) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;   
        this.dateOfBirth = dateOfBirth;
        this.naitonalityId = naitonalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNaitonalityId() {
        return naitonalityId;
    }

    public void setNaitonalityId(String naitonalityId) {
        this.naitonalityId = naitonalityId;
    }
}
