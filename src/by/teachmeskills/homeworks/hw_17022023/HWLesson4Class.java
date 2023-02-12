package by.teachmeskills.homeworks.hw_17022023;

import java.util.Scanner;
public class HWLesson4Class {

    public static void main(String[] sPar) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину стороны А (день недели): ");
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
        System.out.println(" ----- День недели    ---------------- ");
        String sDayOfWeek;
        switch (nSideA) {
            case (1) ->  sDayOfWeek = "Понедельник";
            case (2) ->  sDayOfWeek = "Вторник";
            case (3) ->  sDayOfWeek = "Среда";
            case (4) ->  sDayOfWeek = "Четверг";
            case (5) ->  sDayOfWeek = "Пятница";
            case (6) ->  sDayOfWeek = "Суббота";
            case (7) ->  sDayOfWeek = "Воскресенье";
            default -> sDayOfWeek = "Указанное значение " + nSideA + " не является днем недели ";
        }
        System.out.println("День недели : " + sDayOfWeek);
        System.out.println(" ----- Вывод звездочек   ---------------- ");
        for (int i=0;i<=3;i++){
            for (int j=0;j<=4;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println(" ----- Массив вещественных чисел   ---------------- ");
        int nMax;
        nMax = nSideA + nSideB;

        double[] aMas = new double[nMax];
        for(int i=0;i<nMax;i++){
            aMas[i] = Math.random() * (Math.random() > 0.5 ? 1 : -1);
            System.out.println(" aMas " + i + ": "+aMas[i]);
        }

        double nSumNeg = 0;
        double nMaxPos = 0;
        double nMinNeg = 0;
        int iPosMin = 0;
        int iPosMax = 0;

        for (int i=0;i<nMax;i++){
            if (aMas[i] < 0) {
                nSumNeg += aMas[i];
                if (aMas[i] < nMinNeg) {
                    nMinNeg = aMas[i];
                    iPosMin = i;
                }
            }
            else {
                if (aMas[i] > nMaxPos){
                    nMaxPos = aMas[i];
                    iPosMax = i;
                }
            }
        }
        System.out.println("Индекс минимального числа : " + iPosMin);
        System.out.println("Индекс максимального числа: " + iPosMax);
        System.out.println("Сумма отрицательных чисел : " + nSumNeg);
        int iTmp;
        double nComp = 1;
        if (iPosMin != iPosMax)
        {
            if (iPosMin > iPosMax){
                iTmp = iPosMax;
                iPosMax = iPosMin;
                iPosMin = iTmp;
            }
            for (int i = iPosMin; i<=iPosMax; i++){
                nComp *= aMas[i];
            }
            System.out.println(" Произведение между максимальным/минимальным числами = " + nComp);
        }
        System.out.println(" -----  Пузырьковая сортировка (неотсортированный массив):  ---------------- ");
        double[] aMasAdd = new double[10];
        for (int i=0;i<10; i++){
            aMasAdd[i] = Math.random();
            System.out.println(" aMasAdd " + i + ": "+aMasAdd[i]);
        }
        boolean bFlag = false;
        double nTmp;
        while (!bFlag) {
            bFlag = true;
            for (int i=0;i<10 - 1;i++){

                if (aMasAdd[i]>aMasAdd[i + 1]){
                    bFlag = false;
                    nTmp = aMasAdd[i];
                    aMasAdd[i]= aMasAdd[i + 1];
                    aMasAdd[i + 1] = nTmp;
                }
            }
        }
        System.out.println(" ----- Отсортированный массив : ---------------- ");

        for (int i=0;i<10; i++){
            System.out.println(" aMasAdd " + i + ": "+aMasAdd[i]);
        }
        System.out.println(" -----  Двумерные массивы  ---------------- ");
        int[][] aMas2 = new int[nSideA][nSideB];
        for (int i=0; i<nSideA; i++){
            for (int j=0;j<nSideB;j++){
                aMas2[i][j] =  ((int)(Math.random() * 12) - 15);
                System.out.println(" aMas2 " + i + ":"+j+" = "+aMas2[i][j]);
            }
        }
        int nDel;
        for (int i=0; i<nSideA; i++){
            for (int j=0;j<nSideB;j++){
                nDel =aMas2[i][j]%2;
                if (nDel==0){
                    System.out.print(0);
                }else{
                    System.out.print(1);
                }
            }
            System.out.print("\n");
        }
    }
}
