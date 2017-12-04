package me.jrmensah.workit.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 3)
    private String firstName;
    @NotNull
    @Size(min = 3)
    private String lastName;
    @NotNull
    @Size(min = 3)
    private String contactNumber;
    @NotNull
    @Size(min = 3)
    private String email;
    @NotNull
    @Size(min = 3)
    private String gender;

    @ManyToMany()
    private Set<Experiance> experiances;

    @ManyToMany()
    private Set<Speciality>specialities;

    @ManyToMany()
    private Set<Appointment> appointments;


    public Client() {
    }

    public Client(String firstName, String lastName, String contactNumber, String email, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.gender = gender;
        this.experiances=new HashSet<Experiance>();
        this.specialities=new HashSet<Speciality>();
        this.appointments=new HashSet<Appointment>();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void addExperiance(Experiance experiances) {this.experiances.add(experiances);}

    public void addSpeciality(Speciality specialities) {this.specialities.add(specialities);}
}
