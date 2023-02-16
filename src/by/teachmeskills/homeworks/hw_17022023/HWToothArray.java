package by.teachmeskills.homeworks.hw_17022023;
import java.util.Arrays;

public class HWToothArray {
    public static void main(String[] args) {
        int nCntRow = 5;
        int nCntCol;
        int nVar;

        int[][] aMas = new int[nCntRow][];

        for (int i=0;i<nCntRow;i++){
            nCntCol  = (int) (Math.random() * 11) ;
            aMas[i] = new int[nCntCol];
            System.out.println("Кол-во элементов "+nCntCol);
            for (int j=0; j < nCntCol; j++){
                nVar = ((int)(Math.random() * 12) - 15);
                System.out.print(nVar + " : ");
                aMas[i][j] = nVar;
                }
            System.out.println();
        }



    }
}
