package edu.academy;

import java.util.Arrays;

public class Main {
    // 2.1 Таблица умножения
    public static void main(String[] args) {
        MultTable table = new MultTable();
        table.multTable();
    // 2.2 Факториал
        Factorial resultFact = new Factorial();
        System.out.println(resultFact.factorial(6));
    // 2.3 Перемножить все цифры числа
        resultFact.multNumsInNum(2523);
    //3 ----------------------------------------------------------------
        int[] array1 = {0,1,2,3,4,5,6,7,8,9};
        int[] array2 = {0,1,2,3,4,5,6,7,8,0};
        int[] array3 = {0,1,2,3,5,5,5,7,8,0};
        int[] array4 = {1,1,1,1,1,1,1,1,1,0};
        MassivesAndCycles massive = new MassivesAndCycles();
        massive.doWhile(array1);
        massive.withWhile(array2);
        massive.withFor(array3);
        massive.forEach(array4);

    //4
        int[] sortArray1 = {2,5,0,3,1,9,8,7,4,11};
        int[] sortArray2 = {5,3,2,3,1,8,6,15,8,0};
        int[] sortArray3 = {0,6,7,31,0,2,7,99,1,2};
        int[] sortArray4 = {1,2,1,3,1,4,1,0,5,2};
        Sorts sort = new Sorts();
        System.out.println(Arrays.toString(sort.bubleSort(sortArray1)));
        System.out.println(Arrays.toString(sort.choiceSort(sortArray2)));
        System.out.println(Arrays.toString(sort.insertSort(sortArray3)));
    }



}
