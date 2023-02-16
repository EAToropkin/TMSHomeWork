package by.teachmeskills.homeworks.hw_17022023;

import java.util.Scanner;

public class HWTwoDimArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк массива: ");
        int nCnt1 = scan.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        int nCnt2 = scan.nextInt();

        int[][] aMas = new int[nCnt1][nCnt2];
        for (int i=0; i<nCnt1; i++){
            for (int j=0;j<nCnt2;j++){
                aMas[i][j] =  ((int)(Math.random() * 12) - 15);
                System.out.print(aMas[i][j]+" : ");
            }
            System.out.println();
        }
        System.out.println("Результат (четные/нечетные): ");
        int nDel;
        for (int i=0; i<nCnt1; i++){
            for (int j=0;j<nCnt2;j++){
                nDel =aMas[i][j]%2;
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
