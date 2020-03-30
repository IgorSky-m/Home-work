package edu.academy;

import java.util.Arrays;

public class Sorts {
    //Пузырьком
    public int[] bubleSort (int[] arr) {
        int[] sortArray = Arrays.copyOf(arr,arr.length); // потренировался копировать массив :)
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
    //Выбором
    public int[] choiceSort (int[] arr) {
        int currentArrayElement;
        //5,3,2,3,1,8,6,15,8,0
        for(int i = 0; i < arr.length; i++) {
            currentArrayElement = arr[i];
            int j = i ;
            while ((j-1)>=0 && currentArrayElement < arr[j-1]) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = currentArrayElement;
        }
        return arr;
    }

    //Вставками
    public int[] insertSort (int[] arr) {
        // 3,5,2,9,8,0
        int currentNum = 0, currentIndex = 0;
        for (int i = 0; i <arr.length; i++) {
            currentIndex = 0; //0
            currentNum = arr[0]; //3
            for (int j = 0; j <arr.length -i; j++) {
                if (currentNum < arr[j])  {
                    currentNum = arr[j];
                    currentIndex = j;
                }
            }
            arr[currentIndex] = arr[arr.length -(i+1)];
            arr[arr.length -(i+1)] = currentNum;

        }

        return arr;
    }

    public int[] shakerSort (int[] arr) {
        int leftIndex =0, rightIndex = arr.length -1, currentNum;

        while (leftIndex < rightIndex) {
            for (int i = 0; i < rightIndex; i++) {
                if (arr[i] > arr[i+1]) {
                    currentNum = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = currentNum;
                }
            }// 3,5,2,9,8,0
            rightIndex --;
            for (int i = rightIndex; i > leftIndex; i--) {
                if (arr[i]<arr[i-1]) {
                    currentNum = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = currentNum;
                }
            }
            leftIndex++;
        }
        return arr;
    }

    public int[] mergeSort (int[] arr) {
        if (arr.length == 1) return arr;

        int[] arrLeft = Arrays.copyOfRange(arr,0,arr.length/2);
        int[] arrRight = Arrays.copyOfRange(arr,(arr.length - (arr.length/2)), arr.length);

        arrLeft = mergeSort(arrLeft);
        arrRight = mergeSort(arrRight);

        return mergeArr (arrLeft, arrRight);
    }

    private int[] mergeArr (int[] arrLeft, int[] arrRight) {
        int arrLeftPos = 0, arrRightPos =0;
        int [] mergeArray = new int[arrLeft.length + arrRight.length];

        for (int i = 0; i < mergeArray.length; i++) {

            if (arrLeftPos == arrLeft.length) {
                mergeArray[i] = arrRight[arrRightPos];
                arrRightPos++;
                continue;
            } else if (arrRightPos == arrRight.length) {
                mergeArray[i] = arrLeft[arrLeftPos];
                arrLeftPos++;
                continue;
            }
            if (arrLeft[arrLeftPos] <= arrRight[arrRightPos]) {
                mergeArray[i] = arrLeft[arrLeftPos];
                arrLeftPos++;
            } else if (arrLeft[arrLeftPos] > arrRight[arrRightPos]) {
                mergeArray[i] = arrRight[arrRightPos];
                arrRightPos++;
            }

        }
        return mergeArray;
    }

}
