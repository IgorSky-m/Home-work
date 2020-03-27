package edu.academy;

import java.util.ArrayList;

public class CalculatorStringExpression extends ParentCalculator implements ICalc{
    private String inputString;
    private int operationsCounter;



    public double stringConversion (String inputString)  {
        ArrayList<String> workingList = validateString(inputString); // if error - то закончить
        double calculateResult = calculate(workingList);
        return calculateResult;
    }
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
//            for (int j = 0; j < workString.substring(i,workingString.length()-1).length(); j++) {

                //Проверка на число
                writeResult = ENumbers.validNumber(workString.substring(i,workString.length()));
                if (writeResult.length() > 0) {
                    expressionList.add(writeResult);
                    i += writeResult.length()-1;
                    itsKnownSymbol = true;
                    continue;
                }
  // Проверка на пробел
                 if (workString.charAt(i) == ' ') {
                    itsKnownSymbol = true;
                    continue;
                }

  // Проверка на оператор
                writeResult = EOperators.validSymbol(workString.substring(i,workString.length()));
                if (writeResult.length() > 0) {
                    expressionList.add(writeResult);
                    itsKnownSymbol = true;
                    continue;
                }

   // Запись строки
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
                if (itsKnownSymbol != true ) {
                     errorList.add("error");
                    return errorList;
                 }

        }
        return expressionList;
    }
    private double calculate (ArrayList<String> arrayList) {
        String workString ="";
        int index, priority=100;
        boolean bug = false;
        for (int i = arrayList.size()-1; i >= 0 ; i--) {
            bug = false;
            try {
                Double.parseDouble(arrayList.get(i));
            } catch (NumberFormatException e) {
                bug = true;
                
                if (priority >= EOperators.getPriorityWithSymbol(arrayList.get(i))) {
                    index = i;
                    priority = EOperators.getPriorityWithSymbol(arrayList.get(i));
                    continue;
                }
            }


            if (bug == false) {
                continue;
            }



        }

        return 0;
    }





}
