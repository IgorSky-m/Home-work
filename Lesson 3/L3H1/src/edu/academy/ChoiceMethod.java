package edu.academy;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ChoiceMethod {
    private boolean checkRight = false;
    private Scanner scan = new Scanner(System.in);
    private int numberOfOperations;
    boolean errorTypeCheck;

    public int caseChoice (int numberOfOperations) {
        this.numberOfOperations = numberOfOperations;
        int result = 0;
        System.out.print("Введите номер: ");
        while (checkRight == false) {
            String operationNumber = scan.nextLine();
            try {
                int intCheck = Integer.parseInt(operationNumber);
            } catch (NumberFormatException e) {
                this.errorTypeCheck = true;
            }

            if (this.errorTypeCheck == false) {
                if(Integer.parseInt(operationNumber) > 0 && Integer.parseInt(operationNumber) <= numberOfOperations) {
                    checkRight = true;
                    result = Integer.parseInt(operationNumber);
                } else {
                    System.out.print("Неверный ввод. Попробуйте еще раз: ");
                    }
            } else {
                System.out.print("Неверный ввод. Попробуйте еще раз: ");
                this.errorTypeCheck = false;

            }

        }
            return result;
        }

    public int caseChoice () {
        int result = 0;
        System.out.print("Введите номер: ");
        while (checkRight == false) {
            String operationNumber = scan.nextLine();
            try {
                int intCheck = Integer.parseInt(operationNumber);
            } catch (NumberFormatException e) {
                this.errorTypeCheck = true;
            }

            if (this.errorTypeCheck == false) {
                    checkRight = true;
                    result = Integer.parseInt(operationNumber);
            } else {
                System.out.print("Неверный ввод. Попробуйте еще раз: ");
                this.errorTypeCheck = false;

            }

        }
        return result;
    }



}
