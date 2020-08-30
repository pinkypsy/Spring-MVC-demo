package ua.alvin.entity;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String country;
    private String favoriteLang;
    private String[] operationSystemOptions;
    private int id = 5;

    public String[] getOperationSystemOptions() {
        return operationSystemOptions;
    }

    public void setOperationSystemOptions(String[] operationSystemOptions) {
        this.operationSystemOptions = operationSystemOptions;
    }

    //adding radio buttons w/ map
    private LinkedHashMap<String, String> favoriteLanguageOptionsRB;
    //adding checkboxes w/ map
    private LinkedHashMap<String, String> operationSystemOptionsCB;
    //adding options with map
//    private LinkedHashMap<String, String> countries;

    public Student() {
        // populate favorite language options
        favoriteLanguageOptionsRB = new LinkedHashMap<>();

        // parameter order: value, display label
        favoriteLanguageOptionsRB.put("Java", "Java");
        favoriteLanguageOptionsRB.put("C#", "C#");
        favoriteLanguageOptionsRB.put("PHP", "PHP");
        favoriteLanguageOptionsRB.put("Ruby", "Ruby");

        operationSystemOptionsCB = new LinkedHashMap<>();

        // parameter order: value, display label
        operationSystemOptionsCB.put("Linux", "Linux");
        operationSystemOptionsCB.put("MacOS", "MacOS");
        operationSystemOptionsCB.put("Windows", "Windows");

//        countries = new LinkedHashMap<>();
//        countries.put("UKR", "Ukraine");
//        countries.put("USA", "United States");
//        countries.put("POL", "Poland");
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

    public String getFavoriteLang() {
        return favoriteLang;
    }

    public void setFavoriteLang(String favoriteLang) {
        this.favoriteLang = favoriteLang;
    }

    public LinkedHashMap<String, String> getFavoriteLanguageOptionsRB() {
        return favoriteLanguageOptionsRB;
    }


    public LinkedHashMap<String, String> getOperationSystemOptionsCB() {
        return operationSystemOptionsCB;
    }

    public int getId() {
        return id;
    }

//    public LinkedHashMap<String, String> getCountries() {
//        return countries;
//    }
}


//    adding options with map
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