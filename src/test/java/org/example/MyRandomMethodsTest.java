package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyRandomMethodsTest {
     MyRandomMethods mrm = new MyRandomMethods();

    @Test
    public void test() {
        int tempValue = 0;
        for (int i = 0; i < 1000; i++) {
            tempValue = mrm.RandomBetween1And10();
            System.out.println(tempValue);
            assertTrue((tempValue >= 1) && (tempValue <= 10));
        }
    }
}