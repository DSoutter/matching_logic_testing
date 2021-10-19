package com.codeclan.example.matching_logic;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PairingTest {

    Mentee mentee;
    Preferences preferences;

    Mentor mentor1;
    Mentor mentor2;
    Mentor mentor3;

    ArrayList<Mentor> mentors;
    ArrayList<String> availability1;
    ArrayList<String> availability2;
    ArrayList<String> availability3;
    ArrayList<String> availability4;

    ArrayList<String> spokenLanguages1;
    ArrayList<String> spokenLanguages2;
    ArrayList<String> spokenLanguages3;

    ArrayList<String> capability1;
    ArrayList<String> capability2;

    @Before
    public void before(){
//      mentor 1
        availability1 = new ArrayList<>();
        availability1.add("Mon-Fri Evening");
        availability1.add("Weekend Evenings");
        mentor1 = new Mentor("John", 30, "Edinburgh", availability1, "Male");
        spokenLanguages1 = new ArrayList<>();
        spokenLanguages1.add("Spanish");
        spokenLanguages1.add("French");
        mentor1.setSpokenLanguages(spokenLanguages1);
        capability1 = new ArrayList<>();
        capability1.add("Beginner");
        capability1.add("Elementary");
        capability1.add("Pre-intermediate");
        mentor1.setCapability(capability1);

//       mentor 2
        availability2 = new ArrayList<>();
        availability2.add("Mon-Fri Morning");
        availability2.add("Weekend Days");
        mentor2 = new Mentor("Sally", 40, "Glasgow", availability2, "Female");
        spokenLanguages2 = new ArrayList<>();
        spokenLanguages2.add("Spanish");
        spokenLanguages2.add("French");
        mentor2.setSpokenLanguages(spokenLanguages2);
        capability2 = new ArrayList<>();
        capability2.add("Beginner");
        capability2.add("Elementary");
        mentor2.setCapability(capability2);

//       mentor 3
        availability3 = new ArrayList<>();
        availability3.add("Mon-Fri Morning");
        availability3.add("Weekend Evenings");
        mentor3 = new Mentor("Sandra", 40, "Edinburgh", availability3, "Female");
        spokenLanguages3 = new ArrayList<>();
        spokenLanguages3.add("German");
        mentor3.setSpokenLanguages(spokenLanguages3);

//       mentee
        availability4 = new ArrayList<>();
        availability4.add("Weekend Mornings");
        availability4.add("Weekend Evenings");
        mentee = new Mentee("Eric", 35, "Edinburgh", availability4);
        mentee.setLocationWeighting(0);
        mentee.setEnglishLevel("Pre-intermediate");
        mentee.setNativeLanguage("Spanish");
        mentee.setLanguagesWeighting(1);
        mentee.setGenderPref("No preference");
        mentee.setGenderWeight(1);


        mentors = new ArrayList<>();
        mentors.add(mentor1);
        mentors.add(mentor2);
        mentors.add(mentor3);


        preferences = new Preferences(mentee, mentors);
    }

    @Test
    public void preferencesScoresAreCreated(){
        preferences.getTotalScores();
        assertEquals(12, preferences.getMentors().get(0).getSuitabilityScore());
        assertEquals(2, preferences.getMentors().get(1).getSuitabilityScore());
        assertEquals(6, preferences.getMentors().get(2).getSuitabilityScore());

    }
}
