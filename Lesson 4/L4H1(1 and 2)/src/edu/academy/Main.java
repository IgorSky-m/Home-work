package edu.academy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер цвета радуги: ");
        int enterColor = scan.nextInt();

        Color color = new Color(enterColor);
        System.out.println(color.getColorNumber());
        System.out.println(color.getColorName());
    }
}
