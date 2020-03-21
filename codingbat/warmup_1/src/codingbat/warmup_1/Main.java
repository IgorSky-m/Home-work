package codingbat.warmup_1;

public class Main {

    public static void main(String[] args) {
        SleepIn sleep = new SleepIn();
        System.out.print("Какой сегодня день недели? ");
        String weekday = sleep.sleepInScanner();
        int weekdayNumber = sleep.getNumber();
        System.out.print("Ты сейчас в отпуске? ");
        String vacation = sleep.sleepInScanner();
        int vacationNumber = sleep.getNumber() -1;


    }

}