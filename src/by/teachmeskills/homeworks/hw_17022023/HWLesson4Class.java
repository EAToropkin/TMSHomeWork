package by.teachmeskills.homeworks.hw_17022023;

import java.util.Scanner;

public class HWLesson4Class {

    public static void main(String[] sPar) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину стороны А: ");
        int sideA = scan.nextInt();
        System.out.println("Введите длину стороны Б: ");
        int sideB = scan.nextInt();
        System.out.println("Ведите радиус R: ");
        int radius = scan.nextInt();

        double diagonale = radius * 2;
        double diagonalLength = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

        if (diagonale >= diagonalLength) {
            System.out.println("Круг радиусом " + radius + " закрывает прямоугольник со сторонами " + sideA + "  " + sideB + ", диаметр круга " + diagonale);
        } else {
            System.out.println("Круг радиусом " + radius + " не закрывает прямоугольник со сторонами " + sideA + "  " + sideB + ", диаметр круга " + diagonale);
        }
        System.out.println("Диагональ прямоугольника  = " + diagonalLength);
    }
}
