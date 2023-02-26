package by.teachmeskills.homeworks.hw_24022023;
public class Cicles {
    public static void main(String[] args) {
        double lenDistance = 10;

        for (int i = 1; i <= 6; i++) {
            lenDistance = lenDistance + (lenDistance * 0.01);
        }
        System.out.println("Общая длина дистанции за 7 дней = " + lenDistance +" (м)");
    }
}
