package by.teachmeskills.homeworks.hw_24022023;
public class Ameba {
    public static void main(String[] args) {
        int countDay = 3;
        int countAmeba = 1;
        while (countDay <= 24) {
            countAmeba *= 2;
            System.out.println("Через " + countDay + " ч кол-во амеб = " + countAmeba);
            countDay += 3;
        }
    }
}
