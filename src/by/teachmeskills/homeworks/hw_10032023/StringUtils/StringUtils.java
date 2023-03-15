package by.teachmeskills.homeworks.hw_10032023.StringUtils;

import java.util.Arrays;

public class StringUtils {

    private static char getLastChar(String str) {
        if (str.isEmpty()) {
            return ' ';
        }
        return str.charAt(str.length()-1);
    }

    private static boolean isLastCharExclam(String str) {
        return str.endsWith("!!!");
    }

    private static boolean isFirstCharSinhro(String str) {
        return str.startsWith("Сиреневенький синхрофазатрон");
    }

    private static boolean isIndexOf(String str, String substr) {
        return (str.indexOf(substr) > 0);
    }

    private static String toUpperCaseStr(String str) {
        return str.toUpperCase();
    }

    private static String toLowerCaseStr(String str) {
        return str.toLowerCase();
    }

    private static String stringBuild(int numA, int numB, String oper) {
        double result;

        StringBuilder stringBuilder = new StringBuilder();
        result = switch (oper) {
            case "+" -> numA + numB;
            case "-" -> numA - numB;
            case "*" -> numA * numB;
            case "/" -> numA / numB;
            default -> throw new IllegalArgumentException("Не верный знак операции");
        };

        stringBuilder.append(numA);
        stringBuilder.append(oper);
        stringBuilder.append(numB);
        stringBuilder.append("=");
        stringBuilder.append(result);
        return stringBuilder.toString();
    }

    private static String changeSymbol(String str) {
        int idx = str.indexOf("=");
        StringBuilder stringBuilder = new StringBuilder(str);
        if (idx >= 0) {
            stringBuilder.deleteCharAt(idx);
            stringBuilder.insert(idx, "равно");
        }
        return stringBuilder.toString();
    }

    private static String getMiddleChar(String str1, String str2) {

        int lenStr;
        int lenStr1;

        StringBuilder stringBuilder = new StringBuilder(str1);
        stringBuilder.append(str2);
        lenStr = (int) stringBuilder.length() / 2 - 1;
        lenStr1 = lenStr + 2;
        return stringBuilder.substring(lenStr, lenStr1);
    }

    private static void splitString(String str) {

        String[] array = str.split(" ");
        for (String strWord : array) {
            System.out.println("слово: " + strWord);
        }
    }

    private static void getPalindrome(String str) {

        String[] arr = str.split(" ");

        for (String strWord : arr) {
            StringBuilder word = new StringBuilder(strWord);
            StringBuilder reverseWord = word.reverse();

            if (reverseWord.toString().equals(strWord)) {
                System.out.println("Найден палиндром = " + strWord);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(changeSymbol("54 + 24 = 78"));
        System.out.println(getMiddleChar("абвг", "дежз"));
        splitString("око за око");
        getPalindrome("око за око");
        if (isFirstCharSinhro("Сиреневенький синхрофазатрон фывафвыа")) {
            System.out.println("Да ");
        }
    }

}
