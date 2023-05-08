package by.teachmeskills.homeworks.hw_14042023.LambdaFunc;

import java.util.function.Supplier;

public class LambdaSupplier {
    public static void main(String[] args) {
        Supplier<Double> randomMath = () -> {
            Double numbDouble = Math.random() * 10;
            return numbDouble;
        };

        for (int i = 0; i <= 3; i++) {
            System.out.println("args = " + randomMath.get());
        }
    }
}