package edu.academy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int counter = 0, enterNum;
        boolean itsTrue = false;

        while (counter < 3) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите число:");
            try {
                enterNum = scan.nextInt();
            } catch (InputMismatchException e) {
                counter ++;
                System.out.print("Это не число, повторите попытку ");
                enterNum = 0;
                continue;
            }
            if (enterNum < 1 || enterNum > 11) {
                counter ++;
                System.out.print("Не верное число. ");
            } else {
                itsTrue = true;
                break;
            }
        }
        if (itsTrue == true) {
            System.out.println("Вы ввели верное значение, программа завершена");
        } else System.out.println("Вы ввели верное значение, программа завершена");
    }
}
