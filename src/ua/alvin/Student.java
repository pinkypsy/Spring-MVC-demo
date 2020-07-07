package ua.alvin;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String country;
    private String favoriteLang;
    private String [] operationSystemOptions;

    public String[] getOperationSystemOptions() {
        return operationSystemOptions;
    }

    public void setOperationSystemOptions(String[] operationSystemOptions) {
        this.operationSystemOptions = operationSystemOptions;
    }

    //adding radio buttons w/ map
    private LinkedHashMap<String, String> favoriteLanguageOptions;
    //adding checkboxes w/ map
    private LinkedHashMap<String, String> operationSystemMap;

    public Student() {
        // populate favorite language options
        favoriteLanguageOptions = new LinkedHashMap<>();

        // parameter order: value, display label
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("Ruby", "Ruby");

        operationSystemMap = new LinkedHashMap<>();

        operationSystemMap.put("Linux", "Linux");
        operationSystemMap.put("MacOS", "MacOS");
        operationSystemMap.put("Windows", "Windows");
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

    public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }


    public LinkedHashMap<String, String> getOperationSystemMap() {
        return operationSystemMap;
    }
}
