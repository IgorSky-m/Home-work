package edu.academy;

public class Main {

    public static void main(String[] args) {
        int a = 5, b = 2, c = 8, d = 20 , e = 68, f =22, g = 7, h = 6, i = 3, j = 12, k =119;

        int result1 = a + b/c;
        System.out.println("Пример 5.1 = "+result1);
        //1. деление 2/8 = 0 ,
        //2. сложение 5+0 = 5

        int result2 = (a+b)/c;
        System.out.println("Пример 5.2 = " +result2);
        //1. Сложение в скобках 5+2=7,
        //2. деление 7/8 = 0

        int result3 = (a + b++)/c;
        System.out.println("Пример 5.3 = " +result3);
        //1.Сложение в скобках 5+2 =7
        //2.Увеличение переменной b на 1
        //3.Деление 7/8 = 0

        int result4 = (a + b++)/--c;
        System.out.println("Пример 5.4 = " +result4);
        //1.Сложение в скобках 5+2 =7
        //2.Увеличение переменной b на 1
        //3.Уменьшение переменой c на 1 (c =7)
        //4.Деление 7/7 =1

        int result5 = (a * b >> b++)/--c;
        System.out.println("Пример 5.5 = " +result5);
        /*1.Умножение 5*2 =10
        * 2.Сдвиг вправо на 2 ( 10 >> 2 = 2)
        * 3.Увеличение b на 1
        * 4.Уменьшение с на 1
        * 5.деление 2/7 =0
        */

        int result6 = (a + g > d ? e : f * b >> b++)/--c;
        System.out.println("Пример 5.6 = " +result6);
        /*
        *1.Сложение 5+7 = 12
        *2.Сравнение 12 > 20 (false)
        *3.Умножение 22*2 = 44
        *4.Побитовый сдвиг вправо на 2 (22 >> 2 = 5)
        *5.Увеличение b на 1
        *6.Уменьшение с на 1
        *7.Деление 5/7 = 0
         */


        // int result7 = (a + g > d ? e >= e : f * b >> b++) / --c;
         System.out.println("Пример 5.7 = ОШИБКА типов");
        /*
        *3.ОШИБКА выполнения
         */

        boolean result8 = h - b > i && j*j <=119;
        System.out.println("Пример 5.8 = " +result8);
        /*
        *1.Вычитание 6-2 =4
        *2. 4 > 3 ? (true)
        *3. 12*12 = 144
        *4. 144 <= 119 (false) , ответ false
         */
        boolean result9 = true && false;
        System.out.println("Пример 5.9 = " +result9);
        //1. true
        //2. false, ответ false

    }
}
