package com.example;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline felineCat;

    @Test
    public void checkSoundCat() {
        Cat cat = new Cat(felineCat);
        assertEquals("Мяу", cat.getSound());

    }

    @Test
    public void checkFoodCat() throws Exception {
        Cat cat = new Cat(felineCat);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(cat.getFood()).thenReturn(expected);
        assertEquals(expected, cat.getFood());
    }


}