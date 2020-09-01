package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyRandomMethodsTest {
    MyRandomMethods mrm = new MyRandomMethods();

    @Test
    public void randomBetween1And10() {
        int tempValue = 0;
        for (int i = 0; i < 1000; i++) {
            tempValue = mrm.RandomBetween1And10();
            System.out.println(tempValue);
            assertTrue((tempValue >= 1) && (tempValue <= 10));
        }
    }

    @Test
    public void randomBetween11And20() {
        int tempValue = 0;
        for (int i = 0; i < 1000; i++) {
            tempValue = mrm.RandomBetween11And20();
            System.out.println(tempValue);
            assertTrue((tempValue >= 11) && (tempValue <= 20));
        }
    }

    @Test
    public void randomBetween21And30() {
        int tempValue = 0;
        for (int i = 0; i < 1000; i++) {
            tempValue = mrm.RandomBetween21And30();
            System.out.println(tempValue);
            assertTrue((tempValue >= 21) && (tempValue <= 30));
        }
    }

    @Test
    public void randomBetween31And40() {
        int tempValue = 0;
        for (int i = 0; i < 1000; i++) {
            tempValue = mrm.RandomBetween31And40();
            System.out.println(tempValue);
            assertTrue((tempValue >= 31) && (tempValue <= 40));
        }
    }

    @Test
    public void randomBetween41And50() {
        int tempValue = 0;
        for (int i = 0; i < 1000; i++) {
            tempValue = mrm.RandomBetween41And50();
            System.out.println(tempValue);
            assertTrue((tempValue >= 41) && (tempValue <= 50));
        }
    }
}