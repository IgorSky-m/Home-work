package edu.academy;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int integerFirst = 42;
        int integerSecond = 15;
        int numberOfOperations = 5;
        Scanner scan = new Scanner(System.in);

        ChoiceMethod caseChoice = new ChoiceMethod();
        BitwiseOperation operation = new BitwiseOperation(integerFirst, integerSecond);
        System.out.println("Представленные числа: Первое = " + integerFirst + ", второе =  " + integerSecond);
        System.out.println("Возможные операции: \n1)Побитовое OR  \n2)Побитовое AND \n3)Побитовое XOR \n4)Побитовый унарный NOT \n5)Побитовое сдвиг \n");


            switch (caseChoice.caseChoice(numberOfOperations)) {
                case 1:
                    System.out.println("Вы выбрали операцию \"Побитовое OR\"");
                    operation.printBitwiseOr();
                    break;
                case 2:
                    System.out.println("Вы выбрали операцию \"Побитовое AND\"");
                    operation.printBitwiseAnd();
                    break;
                case 3:
                    System.out.println("Вы выбрали операцию \"Побитовое XOR\"");
                    operation.printBitwiseXor();
                    break;
                case 4:
                    System.out.println("Вы выбрали операцию \"Побитовый унарный NOT\"");
                    operation.printBitwiseUnaryNot();
                    break;
                case 5:
                    System.out.println("Вы выбрали операцию \"Побитовое сдвиг\"");
                    operation.printBitwiseShift();
                    break;
                default:
                    System.out.println("Что-то пошло не так");
        }
    }
}
