package codingbat.warmup_1;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
       // -----------------------------------------------------SleepIn
        SleepIn sleep = new SleepIn();
        boolean weekday = false;
        boolean vacation = false;
        System.out.println(sleep.sleepIn(weekday, vacation));

        //-----------------------------------------------------Diff21
        Diff21 diff = new Diff21();
        int nDiff = 10;
        System.out.println(diff.diff21(nDiff));
        //----------------------------------------------------nearHundred
        NearHundred near = new NearHundred();
        int nNearHundred = 209;
        System.out.println(near.nearHundred(nNearHundred));

        //---------------------------------------------------missingChar
        MissingChar missing = new MissingChar();
        String stringForMissingChar = "kitten";
        int deleteIndex = 2;
        System.out.println(missing.test(stringForMissingChar, deleteIndex));

        //-----------------------------------------------------BackAround
        BackAround backAround = new BackAround();
        String forBackAround = "Igor";
        System.out.println(backAround.backAround(forBackAround));

        //-----------------------------------------------------StartHi
        StartHi startHi = new StartHi();
        String stringForStartHi = "hi all";
        System.out.println(startHi.startHi(stringForStartHi));

        //----------------------------------------------------HasTeen
        HasTeen hasTeen = new HasTeen();
        int a =19, b = 15, c =19;
        System.out.println(hasTeen.hasTeen(a,b,c));

        //----------------------------------------------------MixStart
        MixStart mixStart = new MixStart();
        String forMixStart = "mix Snacks";
        System.out.println(mixStart.mixStart(forMixStart));

        //---------------------------------------------------Close10
        Close10 close10 = new Close10();
        int close10a = 15, close10b = 10;
        System.out.println(close10.close10(close10a,close10b));

        //---------------------------------------------------StringE
        StringE stringE = new StringE();
        String forStringE = "Hello";
        System.out.println(stringE.stringE(forStringE));

        //---------------------------------------------------EveryNth
        EveryNth everyNth = new EveryNth();
        String forEveryNth = "abcdefg";
        int outputCharSeq = 3;
        System.out.println(everyNth.everyNth(forEveryNth,outputCharSeq));

        //---------------------------------------------------MonkeyTrouble
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        boolean aSmile = true, bSmile = true;
        System.out.println(monkeyTrouble.monkeyTrouble(aSmile,bSmile));

        //---------------------------------------------------ParrotTrouble
        ParrotTrouble parrotTrouble = new ParrotTrouble();
        boolean talk = true;
        int hour = 15;
        System.out.println(parrotTrouble.parrotTrouble(talk,hour));

        //--------------------------------------------------FrontBack
        FrontBack frontBack = new FrontBack();
        String forFrontBack = "ab";
        System.out.println(frontBack.frontBack(forFrontBack));

        //--------------------------------------------------or35
        Or35 or35 = new Or35();
        int intOr35 = 150;
        System.out.println(or35.or35(intOr35));

        //-------------------------------------------------icyHot
        IcyHot icyHot = new IcyHot();
        int tempA = -1, tempB = 101;
        System.out.println(icyHot.icyHot(tempA,tempB));

        //-------------------------------------------------loneTeen
        LoneTeen loneTeen = new LoneTeen();
        int ageA = 25, ageB = 25;
        System.out.println(loneTeen.loneTeen(ageA,ageB));

        //------------------------------------------------in3050
        In3050 in3050 = new In3050();
        int in3050a = 32, int3050b = 39;
        System.out.println("in3050 "+ in3050.in3050(in3050a,int3050b));

        //-------------------------------------------------startOz
        StartOz startOz = new StartOz();
        String forStartOz = "ozzy osborne", searchWord = "oz";
        System.out.println(startOz.startOz(forStartOz,searchWord));

        //------------------------------------------------LastDigit
        LastDigit lastDigit = new LastDigit();
        int lastDigitA = 100, lastDigitB = 0;
        System.out.println(lastDigit.lastDigit(lastDigitA,lastDigitB));

        //-------------------------------------------------SumDouble
        SumDouble sumDouble = new SumDouble();
        System.out.println(sumDouble.sumDouble(5,55));

        //-------------------------------------------------Makes10
        Makes10 makes10 = new Makes10();
        System.out.println(makes10.makes10(8,16));

        //------------------------------------------------NotString
        NotString notString = new NotString();
        String textNotString = "bugs", searchNotString = "not";
        System.out.println(notString.notString(textNotString,searchNotString));

        //------------------------------------------------front3
        Front3 front3 = new Front3();
        String inputWordFront3 = "World";
        int frontNumber = 3;
        System.out.println(front3.front3(inputWordFront3,frontNumber));

        //------------------------------------------------front22
        Front22 front22 = new Front22();
        System.out.println(front22.front22("Hello",3));

        //-----------------------------------------------in1020
        DelDel delDel = new DelDel();
        System.out.println(delDel.delDel("adelbc", "del"));

        //-------------------------------------------------max1020
        Max1020 max1020 = new Max1020();
        System.out.println(max1020.max1020(15,16));

        //------------------------------------------------EndUp
        EndUp endUp = new EndUp();
        System.out.println(endUp.endUp("He", 3));

    }


}