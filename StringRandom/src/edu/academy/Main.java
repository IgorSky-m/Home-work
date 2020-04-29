package edu.academy;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
       StringRandom str = new StringRandom();
       String string = str.stringRandom(10);
        System.out.println(string);
    }
}
