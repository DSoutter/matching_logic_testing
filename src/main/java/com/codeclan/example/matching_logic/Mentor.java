package com.codeclan.example.matching_logic;

import java.util.ArrayList;

public class Mentor extends Person{

    private ArrayList<String> capability;
    private int suitabilityScore;
    private String gender;

    public Mentor(String name, int age, String location, ArrayList<String> availability, String gender) {
        super(name, age, location, availability);
        this.gender = gender;
        this.capability = new ArrayList<>();
    }

    public ArrayList<String> getCapability() {
        return capability;
    }

    public void setCapability(ArrayList<String> capability) {
        this.capability = capability;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSuitabilityScore() {
        return suitabilityScore;
    }

    public void increaseSuitabilityScore(int value) {
        this.suitabilityScore += value;
    }
}

