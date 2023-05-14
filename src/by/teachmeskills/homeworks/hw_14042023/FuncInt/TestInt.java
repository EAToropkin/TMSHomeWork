package by.teachmeskills.homeworks.hw_14042023.FuncInt;

import java.util.Scanner;
import java.util.stream.LongStream;

public class TestInt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите вариант расчета (1/2): ");
        int typeCalc = scan.nextInt();
        LambdaInt<Long> refIntLong = null;
        LambdaInt<String> refIntStr = null;

        if (typeCalc == 1) {
            refIntLong = (a) -> {
                Long resVal = LongStream.rangeClosed(1, a)
                        .reduce(1, (long x, long y) -> x * y);
                return resVal;
            };
        } else {
            refIntStr = (s) -> {
                String resValStr = new StringBuilder(s).reverse().toString();
                return resValStr;
            };
        }

        if (typeCalc == 1) {
            System.out.println("Введите целое число: ");
            int numb = scan.nextInt();

            Long res;
            res = refIntLong.getValue((long) numb);
            System.out.println("Факториал числа = " + res);
        } else {
            System.out.println("Введите строку: ");
            String str = scan.next();

            str = refIntStr.getValue(str);
            System.out.println("Перевернутая строка: " + str);
        }
    }
}