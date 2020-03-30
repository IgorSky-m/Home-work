package edu.academy;

public class Factorial {
    public int factorial (int a) {
       Factorial factorial = new Factorial();
       int result = a;
            if (result < 1) {
                result =1;
            } else {
                result *= factorial.factorial(a - 1);
            }

        return result;
    }

    public int multNumsInNum(int a) {
        String lenghtNum = Integer.toString(a);
        int result = 1,  divNum =1 ;
        for (int i = 0; i < lenghtNum.length(); i++) {
            int powNum =1;
            for (int j = 0; j <i ; j++) {
                powNum *=10;
            }
            divNum = a/powNum;
            result *= (divNum % 10);
            //Вынес отдельно для того, чтобы можно было удалить ,чтобы хоть немного не говнокод был))
            if (lenghtNum.length()-i > 1) {
                System.out.print((divNum%10) +"*");
            } else System.out.print(divNum%10);
        }
        System.out.println(" = "+result);
        return result;
    }

}
