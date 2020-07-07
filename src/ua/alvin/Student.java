package ua.alvin;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String country;
//    private LinkedHashMap<String,String> countries;
//
//    public Student() {
//    countries = new LinkedHashMap<>();
//    countries.put("UKR", "Ukraine");
//    countries.put("USA", "United States");
//    countries.put("POL", "Poland");
//    }
//
//    public LinkedHashMap<String, String> getCountries() {
//        return countries;
//    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
