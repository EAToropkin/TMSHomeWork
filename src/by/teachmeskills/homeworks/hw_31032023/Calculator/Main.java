package by.teachmeskills.homeworks.hw_31032023.Calculator;

public class Main {
    public static void main(String[] args) {
        int intNum1 = 100;
        double doubleNum1 = 1.123;

        Calculator calculator = new Calculator(intNum1, doubleNum1);
        System.out.println("int + double:");
        calculator.getSumma();
        calculator.getDivision();
        calculator.getMultiplication();
        calculator.getDifference();

        float floatNum1 = 7 / 3;
        float floatNum2 = 15 / 2;

        System.out.println("float + float:");
        Calculator calculator2 = new Calculator(floatNum1, floatNum2);
        calculator2.getSumma();
        calculator2.getDivision();
        calculator2.getMultiplication();
        calculator2.getDifference();

        long longNum1 = 20 / 3;
        long longNum2 = 51 / 4;

        System.out.println("long + long:");
        Calculator calculator3 = new Calculator(longNum1, longNum2);
        calculator3.getSumma();
        calculator3.getDivision();
        calculator3.getMultiplication();
        calculator3.getDifference();
    }
}
