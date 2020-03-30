package edu.academy;

import java.util.ArrayList;
import java.util.List;

public class CalculatorStringExpression implements ICalc {
    private ICalc calc;
    public CalculatorStringExpression (ICalc calc) {
        this.calc = calc;
    }

    private String inputString;
    private int operationsCounter;


    //-------------------------------------------------------------------Основной вызываемый метод
    public String stringConversion (String inputString)  {
        String workString="";
        ArrayList<String> workingList = validateString(inputString); // if error - то закончить
        if (workingList.get(0).equals("error")){
            return "ОШИБКА";
        }
        workString = calculate(workingList);

        return workString;
    }
    //-------------------------------------------------------------------Проверка строки и внесение ее в ArrayList
    private ArrayList<String> validateString (String workingString) {
        EConstants resultConst;
        ArrayList<String> expressionList = new ArrayList<String>();
        ArrayList<String> errorList = new ArrayList<String>();
        boolean itsKnownSymbol = false;
        String workString, writeResult;
        workString = workingString.trim();
        if (workingString.isEmpty()) {
            errorList.add("error");
            return errorList ; // проверка на пустую строку
        }
        for (int i = 0; i < workString.length(); i++) {
            if (i<workingString.length()-1) {
                itsKnownSymbol = false;}
            writeResult = "";

            //----------------------------------------------------------------Проверка на число
            writeResult = ENumbers.validNumber(workString.substring(i,workString.length()));
            if (writeResult.length() > 0) {
                expressionList.add(writeResult);
                i += writeResult.length()-1;
                itsKnownSymbol = true;
                continue;
            }
            //----------------------------------------------------------------Проверка на пробел
            if (workString.charAt(i) == ' ') {
                itsKnownSymbol = true;
                continue;
            }

            // ----------------------------------------------------------------Проверка на оператор
            writeResult = EOperators.validSymbol(workString.substring(i,workString.length()));
            if (writeResult.length() > 0) {
                expressionList.add(writeResult);
                itsKnownSymbol = true;
                continue;
            }

            //----------------------------------------------------------------- Запись строки
            writeResult = EAlphabet.validString(workingString.substring(i,workingString.length()));
            // проверка на константу
            resultConst = EConstants.validateConstant(writeResult);
            if (resultConst.getConstValue() != 0) {
                expressionList.add(Double.toString(resultConst.getConstValue()));
                i += ((resultConst.name()).length())-1; //
                itsKnownSymbol = true;
                continue;
            }
//            }
            if (itsKnownSymbol != true) { // Добавить проверку на пустой массив
                errorList.add("error");
                return errorList;
            }

        }
        return expressionList;
    }
    // -------------------------------------------------------------------калькулятор

    private String calculate (ArrayList<String> arrayList) {

        ArrayList<String> reArray = new ArrayList<String>();
        String symbolView;
        double calculateResult =0;
        double result =0;
        while (1==1) {
            int arrIndex=0, startIndex=0, endIndex=0,priority = 100, getPriority = 0, arraySize =0;
            boolean bug = false;
            double positionLeft =0, positionRight=0;
            result= 0;

            for (int i = arrayList.size()-1; i >= 0; i--) {
                getPriority = EOperators.getPriorityWithSymbol(arrayList.get(i));
                if (getPriority <= priority && getPriority != 0) {
                    priority = getPriority;
                    arrIndex = i;
                    symbolView = arrayList.get(i);
                } else if (getPriority == 0 && arrayList.size() == 1) {
                    result = Double.parseDouble(arrayList.get(0)); // Возвращаем результат т.к. БЫЛО Только одно число в массиве
                    return Double.toString(result);
                } else if (getPriority == 0 && arrayList.size() > 1) {
                    continue;
                }
            }

// -------------------------------------------------------------------------------------------------------СВИЧ с приоритетами
                switch (priority) {
                    case 1:

                        startIndex = arrIndex;

                        for (int j = startIndex; j < arrayList.size(); j++) {
                            if (EOperators.getPriorityWithSymbol(arrayList.get(j)) == 2) {
                                endIndex = j;
                                break;
                            }
                        }
// Добавить проверку на открытую скобку без закрытой
                        reArray = subArrayList(startIndex+1, endIndex, arrayList);
                        arrayList = deleteArrayRage(startIndex,endIndex+1,arrayList);
                        result += Double.parseDouble(calculate(reArray));
                        arrayList.add(startIndex,Double.toString(result));
                        break;
                    case 2:
                        return "ОШИБКА. Закрывающие скобки без открывающих";
                    case 4:
                        startIndex = arrIndex -1;
                        endIndex = arrIndex +1;
                        if (arrIndex-1 < 0) return "числа слева не существует";
                        try {
                            positionLeft = Double.parseDouble(arrayList.get(arrIndex-1));
                        } catch (NumberFormatException e) {
                            bug = true;
                            return "СЛЕВА НЕ ЧИСЛО";
                        }
                        if (arrIndex+1 > arrayList.size()-1) return "числа справа не существует";
                        try {
                            positionRight = Double.parseDouble(arrayList.get(arrIndex +1));
                        } catch (NumberFormatException e) {
                            bug = true;
                            return "СПРАВА НЕ ЧИСЛО";
                        }
                        result = pow (positionLeft,positionRight);
                        arrayList = deleteArrayRage(startIndex,endIndex+1,arrayList);
                        arrayList.add(startIndex,Double.toString(result));
                        break;
                    case 6:
                        startIndex = arrIndex -1;
                        endIndex = arrIndex +1;
                        if (arrIndex-1 < 0) return "числа слева не существует";
                        try {
                            positionLeft = Double.parseDouble(arrayList.get(arrIndex-1));
                        } catch (NumberFormatException e) {
                            bug = true;
                            return "СЛЕВА НЕ ЧИСЛО";
                        }
                        if (arrIndex+1 > arrayList.size()-1) return "числа справа не существует";
                        try {
                            positionRight = Double.parseDouble(arrayList.get(arrIndex +1));
                        } catch (NumberFormatException e) {
                            bug = true;
                            return "СПРАВА НЕ ЧИСЛО";
                        }
                        if (arrayList.get(arrIndex).equals("-")) {
                            result = sub (positionLeft,positionRight);
                            arrayList = deleteArrayRage(startIndex,endIndex+1,arrayList);
                            arrayList.add(startIndex,Double.toString(result));
                            break;
                        } else if (arrayList.get(arrIndex).equals("+")) {
                            result = summ (positionLeft,positionRight);
                            arrayList = deleteArrayRage(startIndex,endIndex+1,arrayList);
                            arrayList.add(startIndex,Double.toString(result));
                            break;
                        }
                    case 5:
                        startIndex = arrIndex -1;
                        endIndex = arrIndex +1;
                        if (arrIndex-1 < 0) return "числа слева не существует";
                        try {
                            positionLeft = Double.parseDouble(arrayList.get(arrIndex-1));
                        } catch (NumberFormatException e) {
                            bug = true;
                            return "СЛЕВА НЕ ЧИСЛО";
                        }
                        if (arrIndex+1 > arrayList.size()-1) return "числа справа не существует";
                        try {
                            positionRight = Double.parseDouble(arrayList.get(arrIndex +1));
                        } catch (NumberFormatException e) {
                            bug = true;
                            return "СПРАВА НЕ ЧИСЛО";
                        }
                        if (arrayList.get(arrIndex).equals("/")) {
                            result = div (positionLeft,positionRight);
                            arrayList = deleteArrayRage(startIndex,endIndex+1,arrayList);
                            arrayList.add(startIndex,Double.toString(result));
                            break;
                        } else if (arrayList.get(arrIndex).equals("*")) {
                            result = mult (positionLeft,positionRight);
                            arrayList = deleteArrayRage(startIndex,endIndex+1,arrayList);
                            arrayList.add(startIndex,Double.toString(result));
                            break;
                        }
                }

            if (arrayList.size() == 1) break;
        }


        return arrayList.get(0);
    }
//-----------------------------------------------------------------------------Создаем субмассив
    private ArrayList<String> subArrayList (int start, int end, ArrayList<String> arrayList) {
        ArrayList<String> resultArray = new ArrayList<String>();
        for (int i = start; i < end ; i++) {
            resultArray.add(arrayList.get(i));
        }
        return resultArray;
    }
//-----------------------------------------------------------------------------Удаление посчитанных элементов
    private ArrayList<String> deleteArrayRage (int startIndex, int endIndex, ArrayList<String> arrayList ) {
        ArrayList<String> resultArray = new ArrayList<String>();
        for (int i = startIndex; i < endIndex ; i++) {
            arrayList.remove(startIndex);
        }
        return arrayList;
    }

    //-----------------------------------------------------Мат операции;
    public double summ(double a, double b) {
        double result = a + b;
        return result;
    }
    public double sub(double a, double b) {
        double result = a - b;
        return result;
    }
    public double mult(double a, double b) {
        double result = a * b;
        return result;
    }
    public double div(double a, double b) {
        double result = a / b;
        return result;
    }
    public double pow(double a, double b) {
        double resultPow = 1;
        int i = 0;
        while (i < b) {
            resultPow *= a;
            i++;
        }
        return resultPow;
    }
    public double abs (double a) {
        double resultAbs;
        if (a < 0){
            resultAbs = a*(-1);
        } else {
            resultAbs = a;
        }
        return resultAbs;
    }
    public double sqrt(double a) {
        double resultSqrt;
        double minNum = 0;
        double maxNum = a;
        double centerNum;
        resultSqrt =0;
        while (resultSqrt*resultSqrt != a) {
            centerNum = (maxNum +minNum) / 2;
            if (centerNum*centerNum > a) {
                maxNum = centerNum;
            } else if (centerNum*centerNum < a) {
                minNum = centerNum;
            } else {
                resultSqrt = centerNum;
                break;
            }
        }

        return resultSqrt;
    }




}