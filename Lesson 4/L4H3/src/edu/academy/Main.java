package edu.academy;
//       1.   Создать класс CalculatorWithOperator. В классе CalculatorWithOperator должны присутствовать 4 метода
//        (деления, умножение, вычитание, сложение) каждый из этих методов должен принимать два параметра
//        (определитесь с их типами) и должны возвращать результать (определиться с возвращаемым типом результата)
//        при помощи ключевого слово return. Также должно быть ещё 3 метода (Возведение в степень, Модуль числа, Корень из числа).
//        В методах можно использовать оператор + / * -.

//       2.   В отдельном классе, создать мэйн метод. Внутри данного метода создать экземпляр класса CalculatorWithOperator
//        сохранив его в переменную. При помощи методов созданного объекта вичислить результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2.
//        Результат записать в переменную (определить самый подходящий тип переменной). Вывести сохранённый результат в консоль.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double calcResult;
        double calcResultMath;
        CalculatorWithOperator calc = new CalculatorWithOperator();
        CalculatorWithMath calcMath = new CalculatorWithMath();

        //----------------------CalculatioWithOperator--------------------------------------------------------
        System.out.println("CalculatorWithOperator-----------------------------------------------------------");
        calcResult = calc.summ( calc.summ( 4.1,calc.mult(15,7)),calc.pow(calc.div(28,5),2));
        System.out.println("Результат выражения равен " +calcResult);
        calcResult = (calc.summ( calc.summ( 4.1,calc.mult(15,7)),calc.pow(calc.div(28,5),2)))/0;
        System.out.println("Результат деления calcResult на 0 равен " +calcResult);//Infinity
        calcResult = (calc.summ( calc.summ( 4.1,calc.mult(15,7)),calc.pow(calc.div(28,5),2)))/0.0d;
        System.out.println("Результат деления calcResult на 0.0d равен " +calcResult);//Infinity
        System.out.println("\n");

        //--------------------CalculatorWithMath--------------------------------------------------------------
        System.out.println("CalculatorWithMath-----------------------------------------------------------");
        calcResultMath = calcMath.summ( calcMath.summ( 4.1,calcMath.mult(15,7)),calcMath.pow(calcMath.div(28,5),2));
        System.out.println("Результат выражения равен " +calcResultMath);
        calcResultMath = (calcMath.summ( calcMath.summ( 4.1,calcMath.mult(15,7)),calcMath.pow(calcMath.div(28,5),2)))/0;
        System.out.println("Результат деления calcResultMath на 0 равен " +calcResultMath);//Infinity
        calcResultMath = (calcMath.summ( calcMath.summ( 4.1,calcMath.mult(15,7)),calcMath.pow(calcMath.div(28,5),2)))/0.0d;
        System.out.println("Результат деления calcResultMath на 0.0d равен " +calcResultMath);//Infinity
        System.out.println("\n");

        //--------------------CalculatorWithCounter(2 конструктора)----------------------------------------------------------
        System.out.println("CalculatorWithCounter(2 конструктора)-----------------------------------------------------------");
        CalculatorWithCounter countOperator = new CalculatorWithCounter(calc);
        CalculatorWithCounter countMath = new CalculatorWithCounter(calcMath);
        double CalculatorWithCounterOperator;
        double CalculatorWithCounterMath;

        System.out.println("-----------------Counter -> Math");

        CalculatorWithCounterMath = countMath.summ( countMath.summ( 4.1,countMath.mult(15,7)),countMath.pow(countMath.div(28,5),2));
        System.out.println("Результат равен " +CalculatorWithCounterMath);
        CalculatorWithCounterMath = countMath.summ( countMath.summ( 4.1,countMath.mult(15,7)),countMath.pow(countOperator.div(28,5),2))/0;
        System.out.println("Результат Деления на 0 равен " +CalculatorWithCounterMath);
        CalculatorWithCounterMath = countMath.summ( countMath.summ( 4.1,countMath.mult(15,7)),countMath.pow(countMath.div(28,5),2))/0.0d;
        System.out.println("Результат Деления на 0.0d равен " +CalculatorWithCounterMath);


        System.out.println("-----------------Counter -> Operator");

        CalculatorWithCounterOperator = countOperator.summ( countOperator.summ( 4.1,countOperator.mult(15,7)),countOperator.pow(countOperator.div(28,5),2));
        System.out.println("Результат равен " +CalculatorWithCounterOperator);
        CalculatorWithCounterOperator = countOperator.summ( countOperator.summ( 4.1,countOperator.mult(15,7)),countOperator.pow(countOperator.div(28,5),2))/0;
        System.out.println("Результат Деления на 0 равен " +CalculatorWithCounterOperator);
        CalculatorWithCounterOperator = countOperator.summ( countOperator.summ( 4.1,countOperator.mult(15,7)),countOperator.pow(countOperator.div(28,5),2))/0.0d;
        System.out.println("Результат Деления на 0.0d равен " +CalculatorWithCounterOperator);

        System.out.println("Общее количество операций равно " + CalculatorWithCounter.getCountOperation() );
        System.out.println("\n");

        //--------------------CalculatorWithCounterEx(1 конструктор)----------------------------------------------------------
        System.out.println("CalculatorWithCounter(1 конструктор)-----------------------------------------------------------");
        System.out.println("-----------------CounterEx -> Math");
        CalculatorWIthCounterEx calcCounter = new CalculatorWIthCounterEx(calcMath);
        double resultCountExMath;

        resultCountExMath = calcCounter.summ( calcCounter.summ( 4.1,calcCounter.mult(15,7)),calcCounter.pow(calcCounter.div(28,5),2));
        System.out.println("Результат равен " +resultCountExMath);
        resultCountExMath = countOperator.summ( countOperator.summ( 4.1,countOperator.mult(15,7)),countOperator.pow(countOperator.div(28,5),2))/0;
        System.out.println("Результат Деления на 0 равен " +resultCountExMath);
        resultCountExMath = countOperator.summ( countOperator.summ( 4.1,countOperator.mult(15,7)),countOperator.pow(countOperator.div(28,5),2))/0.0d;
        System.out.println("Результат Деления на 0.0d равен " +resultCountExMath);
        System.out.println("Количество операций count равно " +calcCounter.getCountOperation());

        System.out.println("-----------------CounterEx -> Operation");
        CalculatorWIthCounterEx calcCounterOperation = new CalculatorWIthCounterEx(calc);
        double resultCountOperation;

        resultCountOperation = calcCounterOperation.summ( calcCounterOperation.summ( 4.1,calcCounterOperation.mult(15,7)),calcCounterOperation.pow(calcCounterOperation.div(28,5),2));
        System.out.println("Результат равен " +resultCountOperation);
        resultCountOperation = calcCounterOperation.summ( calcCounterOperation.summ( 4.1,calcCounterOperation.mult(15,7)),calcCounterOperation.pow(calcCounterOperation.div(28,5),2))/0;
        System.out.println("Результат Деления на 0 равен " +resultCountOperation);
        resultCountOperation = calcCounterOperation.summ( calcCounterOperation.summ( 4.1,calcCounterOperation.mult(15,7)),calcCounterOperation.pow(calcCounterOperation.div(28,5),2))/0.0d;
        System.out.println("Результат Деления на 0.0d равен " +resultCountOperation);
        System.out.println("Количество операций count равно " +calcCounterOperation.getCountOperation());


        CalculatorStringExpression test = new CalculatorStringExpression();
        Scanner scan = new Scanner(System.in);
       // String mathScan = scan.nextLine();
        System.out.println(test.stringConversion("1+4*3+(2*4)"));







    }
}
