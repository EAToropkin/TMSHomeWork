package by.teachmeskills.homeworks.hw_17022023;

import java.util.Scanner;
public class HWLesson4Class {

    public static void main(String[] sPar) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину стороны А: ");
        int nSideA = scan.nextInt();
        System.out.println("Введите длину стороны Б: ");
        int nSideB = scan.nextInt();
        System.out.println("Ведите радиус R: ");
        int nRadius = scan.nextInt();

        double nDia = nRadius *2;
        double nLenDiag = Math.sqrt(Math.pow(nSideA,2) + Math.pow(nSideB,2));

        if (nDia >= nLenDiag) {
            System.out.println("Круг радиусом "+ nRadius + " закрывает прямоугольник со сторонами " + nSideA + "  " + nSideB + ", диаметр круга " + nDia);
        }
        else{
            System.out.println("Круг радиусом "+ nRadius + " не закрывает прямоугольник со сторонами " + nSideA+ "  " + nSideB + ", диаметр круга " + nDia);
        }
        System.out.println("Диагональ прямоугольника  = " + nLenDiag);
    }
}
