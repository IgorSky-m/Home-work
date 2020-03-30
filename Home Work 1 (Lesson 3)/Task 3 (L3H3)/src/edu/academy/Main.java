package edu.academy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String defaultMaleName = "Вася";
        String defaultFemaleName = "Анастасия";

        Scanner scan = new Scanner(System.in);
        String enterName = scan.nextLine();

        //Через if, else if
        System.out.println("\n\nif, else if, else--------------------------------------");


        if (enterName.equals(defaultMaleName)) {
            System.out.println("Привет! \nЯ тебя так долго ждал");
        } else if (enterName.equals(defaultFemaleName)) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а Вы кто?");
        }


        //Через switch case
        System.out.println("\n\nSwitch --------------------------------------");


        switch (enterName) {
            case "Вася":
                System.out.println("Привет! \nЯ тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а Вы кто?");
                break;
        }







    }
}
