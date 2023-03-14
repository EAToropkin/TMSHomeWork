package by.teachmeskills.homeworks.hw_03032023.Calculator;

public class Calculator {
    private int fieldOne;
    private int fieldSecond;

    public Calculator(int fieldOne, int fieldSecond) {
        this.fieldOne = fieldOne;
        this.fieldSecond = fieldSecond;
    }

    public int getFieldOne() {
        return fieldOne;
    }

    public void setFieldOne(int fieldOne) {
        this.fieldOne = fieldOne;
    }

    public int getFieldSecond() {
        return fieldSecond;
    }

    public void setFieldSecond(int fieldSecond) {
        this.fieldSecond = fieldSecond;
    }

    public int getSumma() {
        return fieldOne + fieldSecond;
    }

    public int getDifference() {
        return fieldOne - fieldSecond;
    }

    public int getMultiplication() {
        return fieldOne * fieldSecond;
    }

    public double getDivision() {
        try {
            return fieldOne / fieldSecond;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка!!! На ноль делить нельзя");
        }
        return 0;
    }
}
