package com.codeclan.example.matching_logic;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MentorTest {

    Mentor mentor;
    ArrayList<String> availability;
    ArrayList<String> spokenLanguages;
    ArrayList<String> capability;

    @Before
    public void before() {
        availability = new ArrayList<>();
        availability.add("Mon-Fri Evening");
        availability.add("Weekend Days");
        mentor = new Mentor("John", 30, "Edinburgh", availability, "Male");
        spokenLanguages = new ArrayList<>();
        spokenLanguages.add("Spanish");
        spokenLanguages.add("French");
        mentor.setSpokenLanguages(spokenLanguages);
        capability = new ArrayList<>();
        capability.add("Beginner");
        capability.add("Elementary");
        mentor.setCapability(capability);
    }

    @Test
    public void mentorHasName(){
        assertEquals("John", mentor.getName());
    }

    @Test
    public void mentorHasAvailability(){
        assertEquals(2, mentor.getAvailability().size());
        assertTrue(mentor.getAvailability().contains("Weekend Days"));
        assertFalse(mentor.getAvailability().contains("Weekend Mornings"));
    }

    @Test
    public void mentorHasLanguages(){
        assertEquals(2, mentor.getSpokenLanguages().size());
        assertTrue(mentor.getSpokenLanguages().contains("Spanish"));
        assertFalse(mentor.getSpokenLanguages().contains("German"));
    }

    @Test
    public void mentorHasLocation(){
        assertEquals("Edinburgh", mentor.getLocation());
    }

    @Test
    public void mentorHasCapabilities(){
        assertEquals(2, mentor.getCapability().size());
        assertTrue(mentor.getCapability().contains("Beginner"));
        assertFalse(mentor.getCapability().contains("Pre-intermediate"));
    }
}


