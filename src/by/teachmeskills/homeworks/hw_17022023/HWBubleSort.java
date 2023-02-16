package by.teachmeskills.homeworks.hw_17022023;
public class HWBubleSort {
    public static void main(String[] args) {
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
    }
}
