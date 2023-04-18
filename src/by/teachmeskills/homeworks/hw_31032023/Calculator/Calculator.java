package by.teachmeskills.homeworks.hw_31032023.Calculator;

public class Calculator {
    private double fieldOne;
    private double fieldSecond;

    public Calculator(double fieldOne, double fieldSecond) {
        this.fieldOne = fieldOne;
        this.fieldSecond = fieldSecond;
    }

    private static <N extends Number> double summa(N a, N b) {
        return a.doubleValue() + b.doubleValue();
    }

    private static <N extends Number> double diff(N a, N b) {

        return a.doubleValue() - b.doubleValue();
    }

    private static <N extends Number> double mult(N a, N b) {
        return a.doubleValue() * b.doubleValue();
    }

    private static <N extends Number> double div(N a, N b) {

        try {
            return a.doubleValue() / b.doubleValue();
        } catch (ArithmeticException e) {
            System.out.println("Ошибка!!! На ноль делить нельзя");
        }
        return 0;
    }

    public void getSumma() {
        System.out.println(summa(this.fieldOne, this.fieldSecond));
    }

    public void getDifference() {
        System.out.println(diff(this.fieldOne, this.fieldSecond));
    }

    public void getMultiplication() {
        System.out.println(mult(this.fieldOne, this.fieldSecond));
    }

    public void getDivision() {
        System.out.println(mult(this.fieldOne, this.fieldSecond));
    }
}
