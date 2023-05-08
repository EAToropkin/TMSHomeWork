package by.teachmeskills.homeworks.hw_14042023.LambdaFunc;

import java.util.function.Function;

public class LambdaFunc {
    public static void main(String[] args) {

        Function<Double, String> checkNumber = d -> {
            if (d < 0) return "Отрицательное";
            if (d == 0) return "Ноль";
            if (d > 0) return "Положительное";
            return " ";
        };

        System.out.println(checkNumber.apply(-1.5));
        System.out.println(checkNumber.apply(7.3));
        System.out.println(checkNumber.apply(0.0));
    }
}