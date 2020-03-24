package edu.academy;

import java.util.Arrays;

public class Sorts {
    //Пузырьком
    public int[] bubleSort (int[] a) {
        int[] sortArray = Arrays.copyOf(a,a.length); // потренировался копировать массив :)
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            int arrayElement;
            for (int i = 0; i<sortArray.length-1; i++){
                if (sortArray[i]>sortArray[i+1]) {
                    arrayElement = sortArray[i];
                    sortArray[i] = sortArray[i + 1];
                    sortArray[i+1] = arrayElement;

                    sorted = false;
                }
            }
        }
        return sortArray;
    }
    //Вставками
    public int[] choiceSort (int[] a) {
        int currentArrayElement;
        //5,3,2,3,1,8,6,15,8,0
        for(int i = 0; i < a.length; i++) {
            currentArrayElement = a[i];
            int j = i ;
            while ((j-1)>=0 && currentArrayElement < a[j-1]) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = currentArrayElement;
        }
        return a;
    }

    //Выбором
    public int[] insertSort (int[] a) {
        // 3,5,2,9,8,0
        int currentNum = 0, currentIndex = 0;
        for (int i = 0; i <a.length; i++) {
            currentIndex = 0; //0
            currentNum = a[0]; //3
            for (int j = 0; j <a.length -i; j++) {
                if (currentNum < a[j])  {
                    currentNum = a[j];
                    currentIndex = j;
                }
            }
            a[currentIndex] = a[a.length -(i+1)];
            a[a.length -(i+1)] = currentNum;

        }

        return a;
    }



}
