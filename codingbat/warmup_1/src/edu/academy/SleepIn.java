package edu.academy;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SleepIn {
    private String[][] weekDay = {
            {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"},
            {"пн", "вт", "ср", "чт", "пт", "сб", "вс"},
            {"1","2","3","4","5","6","7"},
            {"да", "нет", "yes", "no", "maybe","ага","неа"},
    };
    private String[] vacation = {"да", "нет", "yes", "no", "maybe","ага","неа"};
    private String resultDay;
    private int dayNumber;



    public String sleepInScanner () {
        Scanner scanDay = new Scanner(System.in);
        int indexStrDay, indexStrVacation;
        boolean daySearch = false, vacationSearch = false;
        String day, dayStr;
//-------------------------------Скан данных---------------------------------------
        day = scanDay.nextLine();
        day = day.trim();
        day = day.toLowerCase();
// -------------------------------Сверка значения с массивом данных ---------------
        while (!daySearch ) {
            int i;
            for (i = 0; i < weekDay.length ; i++) {
                for (int k = 0 ;k < weekDay[i].length ;k ++) {
                    dayStr = String.valueOf(weekDay[i][k]);
                    dayStr = dayStr.toLowerCase();
                    indexStrDay = dayStr.indexOf(day);
                    if (indexStrDay >= 0) {
                        resultDay = weekDay[i][k];
                        dayNumber = k+1;
                        daySearch = true;
                        break;
                    }
                }
                if (daySearch == true) break;
            }
            if (i >= weekDay.length) {
                System.out.print("Я Тебя не понял. Напиши пожалуйста еще раз: ");
                day = scanDay.nextLine();
                day = day.trim();
                day = day.toLowerCase();
            }
        }
        return resultDay;
    }

    public int getDayNumber(){
        return dayNumber;
    }
}
