package org.example;

public class Main {
    public static void main(String[] args) {
        MyRandomMethods mrm = new MyRandomMethods();
        for (int i = 0; i < 20 ; i++) {
            System.out.println(mrm.RandomBetween21And30());
        }
    }
}
