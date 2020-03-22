package codingbat.warmup_1;


import java.util.Scanner;

public class SleepIn {
    private String[][] weekDay = {
            {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье", "Да", "Нет", "da", "net"},
            {"пн", "вт", "ср", "чт", "пт", "сб", "вс"},
            {"1","2","3","4","5","6","7"},
    };
    private String[] vacation = {"да", "нет", "yes", "no", "maybe","ага","неа"};
    private String result;
    private int indexArray;



    public String sleepInScanner () { // возвращает Строковое значениие недели
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
                        result = weekDay[0][k];
                        indexArray = k;
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
        return result;
    }

    public int getIndexArray(){
        return indexArray;
    }

    public boolean sleepIn (boolean weekday, boolean vacation){
        if (weekday == false || vacation == true){
            return true;
        } else return false;
    }



}

