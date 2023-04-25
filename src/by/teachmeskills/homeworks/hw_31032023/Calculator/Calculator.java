package by.teachmeskills.homeworks.hw_31032023.Calculator;

public class Calculator <N extends Number> {

    private N var1;
    private N var2;

    public Calculator(N var1, N var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public <N extends Number> void getSumma() {
        System.out.println(var1.doubleValue() + var2.doubleValue());
    }

    public  <N extends Number> void getDifference() {
        System.out.println(var1.doubleValue() - var2.doubleValue());
    }

    public  <N extends Number> void getMultiplication() {
        System.out.println(var1.doubleValue() * var2.doubleValue());
    }

    public  <N extends Number> void getDivision() {

        double res = 0;
        try {
            res = var1.doubleValue() / var2.doubleValue();
        } catch (ArithmeticException e) {
            System.out.println("Ошибка!!! На ноль делить нельзя");
        }
        System.out.println(res);
    }
}
