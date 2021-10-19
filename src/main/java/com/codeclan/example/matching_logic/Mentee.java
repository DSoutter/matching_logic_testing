package com.codeclan.example.matching_logic;

import java.util.ArrayList;

public class Mentee extends Person {


    private int locationWeighting;
    private String englishLevel;
    private String nativeLanguage;
    private int languagesPref;
    private int languagesWeighting;
    private String genderPref;
    private int genderWeight;
    private int agePref;
    private int ageWeighting;



    public Mentee(String name, int age, String location, ArrayList<String> availability) {
        super(name, age, location, availability);
    }


    public int getLocationWeighting() {
        return locationWeighting;
    }

    public void setLocationWeighting(int locationWeighting) {
        this.locationWeighting = locationWeighting;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public int getLanguagesPref() {
        return languagesPref;
    }

    public void setLanguagesPref(int languagesPref) {
        this.languagesPref = languagesPref;
    }

    public int getLanguagesWeighting() {
        return languagesWeighting;
    }

    public void setLanguagesWeighting(int languagesWeighting) {
        this.languagesWeighting = languagesWeighting;
    }

    public String getGenderPref() {
        return genderPref;
    }

    public void setGenderPref(String genderPref) {
        this.genderPref = genderPref;
    }

    public int getGenderWeight() {
        return genderWeight;
    }

    public void setGenderWeight(int genderWeight) {
        this.genderWeight = genderWeight;
    }

    public int getAgePref() {
        return agePref;
    }

    public void setAgePref(int agePref) {
        this.agePref = agePref;
    }

    public int getAgeWeighting() {
        return ageWeighting;
    }

    public void setAgeWeighting(int ageWeighting) {
        this.ageWeighting = ageWeighting;
    }
}
