package ua.alvin.entity;

import ua.alvin.constraint.CourseCode;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "customers")
public class Customer {


    @Id//mark for primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//let mysql handle the generation of autoincrement
    @Column(name = "id")
    private int id;

    @NotNull(message = "is required")
    @Size(min = 1)
    @Column(name = "first_name")
    private String firstName;
    @NotNull(message = "at least 1 is required")
    @Size(min=1, message="Shouldn't be empty")
    @Column(name = "last_name")
    private String lastName;

    @NotNull(message = "at least 1 is required")
    @Min(value = 0, message = "min 0")
    @Max(value = 10, message = "max 10")
    @Column(name = "free_passes")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "5 chars/digits")
    @Column(name = "postal_code")
    private String postalCode;

    @CourseCode(value = {"TOPS", "LUV"}, message = "must start with TOPS or LUV")
    @Column(name = "course_code")
    private String courseCode;

    public Customer() { }



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

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
