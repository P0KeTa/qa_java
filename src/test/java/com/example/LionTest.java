package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Spy
    Feline feline;

    @Test
    public void checkLionKittens() {
        Lion lion = new Lion(feline);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void checkLionFood() throws Exception {
        Lion lion = new Lion(feline);

        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(lion.getFood()).thenReturn(expected);

        assertEquals(expected,lion.getFood());
    }
}