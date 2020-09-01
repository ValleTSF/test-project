package org.example;

import java.util.Random;

public class MyRandomMethods {
    Random random = new Random();

    public int RandomBetween1And10(){
        int result = random.nextInt(10) + 1;
        return result;
    }

    public int RandomBetween11And20(){
        int result = random.nextInt(10) + 11;
        return result;
    }

    public int RandomBetween21And30(){
        int result = random.nextInt(10) + 21;
        return result;
    }

    public int RandomBetween31And40(){
        int result = random.nextInt(10) + 31;
        return result;
    }

    public int RandomBetween41And50(){
        int result = random.nextInt(10) + 41;
        return result;
    }

}
