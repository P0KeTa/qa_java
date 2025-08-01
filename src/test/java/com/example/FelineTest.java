package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline;

    @Test
    public void checkEatMeatFeline() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void checkFamilyFeline() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void checkKittensFeline() {
        assertEquals(1, feline.getKittens());
        assertEquals(3, feline.getKittens(3));
    }
}