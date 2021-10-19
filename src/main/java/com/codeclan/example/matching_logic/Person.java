package com.codeclan.example.matching_logic;

import java.util.ArrayList;

public class Person {

    private String name;
    private int age;
    private String location;
    private ArrayList<String> availability;
    private ArrayList<String> spokenLanguages;

    public Person(String name, int age, String location, ArrayList<String> availability) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.availability = availability;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAvailability(ArrayList<String> availability) {
        this.availability = availability;
    }

    public ArrayList<String> getAvailability() {
        return availability;
    }

    public void addAvailability(String availability) {
        this.availability.add(availability);
    }

    public ArrayList<String> getSpokenLanguages() {
        return spokenLanguages;
    }

    public void setSpokenLanguages(ArrayList<String> spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public void addLanguage(String language){
        this.spokenLanguages.add(language);
    }
}
