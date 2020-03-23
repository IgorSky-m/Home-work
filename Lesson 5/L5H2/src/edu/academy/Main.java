package edu.academy;

public class Main {
    // 2.1 Таблица умножения
    public static void main(String[] args) {
        MultTable table = new MultTable();
        table.multTable();
    // 2.2 Факториал
        Factorial resultFact = new Factorial();
        System.out.println(resultFact.factorial(6));
    }
}
