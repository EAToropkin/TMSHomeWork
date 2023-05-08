package by.teachmeskills.homeworks.hw_14042023.BuiltInInt;

import java.util.function.Predicate;

public class BuildInTest {
    public static void main(String[] args) {
        Predicate<String> pred;
        pred = (value) -> !(value.isEmpty());

        Predicate<String> predLambdaChk;
        predLambdaChk = (value) -> {
            boolean res;
            if (value.isEmpty() || value.isBlank()) {
                res = false;
            } else {
                res = true;
            }
            return res;
        };

        System.out.println("Строка не пустая? : " + pred.test("123"));
        System.out.println("Строка не пустая? : " + predLambdaChk.test("123"));

        Predicate<String> predAndChk;
        predAndChk = ((Predicate<String>) p -> !p.isEmpty()).and(p -> !(p == null));
        System.out.println("Строка не Null и не Пустая? : " + predAndChk.test("123"));
    }
}