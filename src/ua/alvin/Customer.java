package ua.alvin;

import javax.validation.constraints.*;

public class Customer {

//    @NotNull(message = "is required")
//    @Size(min = 1)
    private String firstName;
    @NotNull(message = "at least 1 is required")
    @Size(min=1, message="Shouldn't be empty")
    private String lastName;

    @NotNull(message = "at least 1 is required")
    @Min(value = 0, message = "min 0")
    @Max(value = 10, message = "max 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "5 chars/digits")
    private String postalCode;

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
}
