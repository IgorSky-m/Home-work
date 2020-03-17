package edu.academy;
import java.util.Scanner;

public class BitwiseOperation {
    private int integerFirst;
    private int integerSecond;
    Scanner scanShift = new Scanner(System.in);
    public BitwiseOperation(int integerFirst, int integerSecond) {
        this.integerFirst = integerFirst;
        this.integerSecond = integerSecond;
    }

    public void printBitwiseOr () {
        /* ИЛИ:
         *1 or 1 = 1;
         *0 or 1 = 1;
         *1 or 0 = 1;
         *0 or 0 = 0;
         */
        int result = this.integerFirst | this.integerSecond;
        System.out.println("Операция OR \"|\"");
        System.out.println("Первое число в двоичной системе = "+Integer.toBinaryString(this.integerFirst));
        System.out.println("Второе число в двоичной системе = "+Integer.toBinaryString(this.integerSecond));
        System.out.println("Результат операции OR в двоичной системе  = "+Integer.toBinaryString(result));
        System.out.println("Результат  OR в десятичной системе: "+result);
        System.out.println("-------------------------------------------------------------------------------");

    }

    public void printBitwiseAnd () {
        /* И
         * 1 and 0 = 0;
         * 0 and 1 = 0;
         * 0 and 0 = 0;
         * 1 and 1 = 1;
         */
        int result = this.integerFirst & this.integerSecond;
        System.out.println("Операция AND \"&\"");
        System.out.println("Первое число в двоичной системе = "+Integer.toBinaryString(this.integerFirst));
        System.out.println("Второе число в двоичной системе = "+Integer.toBinaryString(this.integerSecond));
        System.out.println("Результат операции AND в двоичной системе  = "+Integer.toBinaryString(result));
        System.out.println("Результат  AND в десятичной системе: "+result);
        System.out.println("-------------------------------------------------------------------------------");
    }

    public void printBitwiseXor () {
        /* Исключающее OR
         *1 ^ 0 = 1;
         * 0 ^ 1 = 1;
         * 0 ^ 0 = 0;
         * 1 ^ 1 = 1;
         */
        int result = this.integerFirst ^ this.integerSecond;
        System.out.println("Операция XOR \"^\"");
        System.out.println("Первое число в двоичной системе = " + Integer.toBinaryString(this.integerFirst));
        System.out.println("Второе число в двоичной системе = " + Integer.toBinaryString(this.integerSecond));
        System.out.println("Результат операции XOR в двоичной системе  = " + Integer.toBinaryString(result));
        System.out.println("Результат  XOR в десятичной системе: " + result);
        System.out.println("-------------------------------------------------------------------------------");
    }

    public void printBitwiseUnaryNot () {
        // Унарный NOT инвертирует биты числа ( 1 в 0 и 0 в 1). Чтобы получить Инвертирование знака (-42 и +42) Нужно добавлять +1
        int resultFirstInteger = ~this.integerFirst;
        int resultSecondInteger = ~this.integerSecond;
        System.out.println("Операция UNARY NOT \"~\"");
        System.out.println("Первое число = " + resultFirstInteger +". В Двоичной системе = " +Integer.toBinaryString(resultFirstInteger));
        System.out.println("Второе число = " + resultSecondInteger +". В Двоичной системе = " +Integer.toBinaryString(resultSecondInteger));
        System.out.println("-------------------------------------------------------------------------------");
    }

    public void printBitwiseShift () {

        // Сдвигает биты. Сдвиг влево (увеличивает значение): << . Сдвиг вправо (уменьшает значение): >>. Заполнение происходит предыдущим значением (был 0, значит будут Нули. Была цифра 1 - будут еденицы)
        ChoiceMethod choice = new ChoiceMethod();
        System.out.println("Операция сдвига. Чтобы продолжить, необходимо указать сдвиг.");
        int bitwiseShift = choice.caseChoice();
        int resultFirstInteger = this.integerFirst << bitwiseShift;
        int resultSecondInteger = this.integerSecond >> bitwiseShift;
        int resultThirdInteger = this.integerSecond >>> bitwiseShift;
        System.out.println("Операция сдвига \"<<\" ,\">>\"");
        System.out.println("Первое число в двоичной системе до сдвига влево = " + Integer.toBinaryString(this.integerFirst));
        System.out.println("Первое число в двоичной системе после сдвига влево = " + Integer.toBinaryString(resultFirstInteger) + " Десятичное число после сдвига = " +resultFirstInteger);
        System.out.println("Второе число в двоичной системе до сдвига вправо = " + Integer.toBinaryString(this.integerSecond));
        System.out.println("Второе число в двоичной системе после сдвига вправо = " + Integer.toBinaryString(resultSecondInteger) + " Десятичное число после сдвига = " +resultSecondInteger);
        //Сдвиг без учета знака заполняет значения нулями не зависимо от того, каким был старший бит
        System.out.println("Сдвиг с заполнением нулями второго значения  \">>>\" в двоичной системе = " + Integer.toBinaryString(resultThirdInteger));
        System.out.println("-------------------------------------------------------------------------------");
    }



}
