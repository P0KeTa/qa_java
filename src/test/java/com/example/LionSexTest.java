package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionSexTest {

    private final String sex;

    public LionSexTest(String sex) {
        this.sex = sex;
    }


    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][] {
                {"Самка"},
                {"Самец"},
        };
    }

    @Test
    public void checkLionMaleSex() throws Exception {
        Lion lionSex = new Lion(sex);
        if (sex.equals("Самка")) {
            assertFalse(lionSex.doesHaveMane());
        } else if (sex.equals("Самец")) {
            assertTrue(lionSex.doesHaveMane());
        }
    }
}
