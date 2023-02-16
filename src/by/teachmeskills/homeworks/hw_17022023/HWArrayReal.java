package by.teachmeskills.homeworks.hw_17022023;

public class HWArrayReal {
    public static void main(String[] args) {
        int nCount = 7;

        double[] aMas = new double[nCount];
        for(int i=0;i<nCount;i++){
            aMas[i] = Math.random() * (Math.random() > 0.5 ? 1 : -1);
            System.out.print(" aMas " + i + ": "+aMas[i]);
        }

        double nSumNeg = 0;
        double nMaxPos = 0;
        double nMinNeg = 0;
        int iPosMin = 0;
        int iPosMax = 0;

        for (int i=0;i<nCount;i++){
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




    }




}
