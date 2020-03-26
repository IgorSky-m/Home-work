package edu.academy;
public class CalculatorStringExpression extends ParentCalculator implements ICalc{
    private String inputString;
    private int operationsCounter;

    private String validateString (String workingString) {
        EConstants result;
        String workString;
        if (workingString.isEmpty()) return "СТРОКА ПУСТАЯ";
        workString = workingString.trim();
        char[] charArray = workString.toCharArray();
        char[] knownSymbols = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '+', '-', '/', '*', '^', '(', ')'};
        String resultString = "";
        boolean itsKnownSymbol = false;
        for (int i = 0; i < charArray.length; i++) {
            itsKnownSymbol = false;
            for (int j = 0; j < knownSymbols.length; j++) { //это известный символ?
                if (Character.valueOf(charArray[i]) == Character.valueOf(knownSymbols[j])) { //совпадение известных символов
                    resultString = resultString + charArray[i];
                    itsKnownSymbol = true;
                    break;
                } else if (charArray[i] == ' ') { // пробел
                    itsKnownSymbol = true;
                    break;

                }
            }

            if (itsKnownSymbol == false) {
                result = EConstants.validateConst(workString.substring(i, workString.length())); //Константа
                if (result.getConstValue() != 0) {
                    resultString = resultString + result.getConstValue();
                    i += ((result.name()).length()) -1;
                    itsKnownSymbol = true;

                }
            }
        }
        if (itsKnownSymbol == false) return "ОШИБКА";
        return resultString;
    }


    public String stringConversion (String inputString)  {
        String workingString = validateString(inputString);
        //проверка на валидность



        return workingString;
    }
}


//----------------------------------------------------------------
//private double validateString (String workingString) {
//    for (int i = 0; i <workingString.length(); i++) {
//        boolean  itsKnownSymbol = true;
//        int numberA, numberB;
//        String workString = workingString.substring(operationsCounter,workingString.length()-1);
//        for (int j = 0; j <workString.length(); j++) {
//            switch (workString.charAt(j)) {
//                case '1':
//                case '2':
//                case '3':
//                case '4':
//                case '5':
//                case '6':
//                case '7':
//                case '8':
//                case '9':
//                case '0':
//                    operationsCounter++;
//                    itsKnownSymbol = true;
//                    break;
//                case '+':
//                    operationsCounter++;
//                    itsKnownSymbol = true;
//                    break;
//                case "(":
//                    operationsCounter++;
//                    validateString(workString);
//                    break;
//                default:
//                    System.out.println("Ошибка");
//                    break;
//
//            }
//            workString = workString.substring(operationsCounter,workingString.length()-1);
//        }
//    }
//    return 0;
//}