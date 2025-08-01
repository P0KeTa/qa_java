package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Spy
    Feline feline;

    @Test
    public void checkAlexFriends() {
        LionAlex lionAlex = new LionAlex(feline);
        String expected = "Марти, Глория, Мелман";
        assertEquals(expected, lionAlex.getFriends());
    }

    @Test
    public void checkAlexPlaceOfLiving() throws Exception {
        LionAlex lionAlex = new LionAlex("Самец");
        String expected = "Нью-Йоркский зоопарк";
        assertEquals(expected, lionAlex.getPlaceOfLiving());
    }

    @Test
    public void checkAlexKittens() {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(0, lionAlex.getKittens());
    }

}