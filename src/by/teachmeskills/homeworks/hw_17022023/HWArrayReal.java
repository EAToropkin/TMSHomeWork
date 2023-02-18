package by.teachmeskills.homeworks.hw_17022023;
public class HWArrayReal {
    public static void main(String[] args) {
        int count = 7;

        double[] array = new double[count];
        for (int i = 0; i < count; i++) {
            array[i] = Math.random() * (Math.random() > 0.5 ? 1 : -1);
            System.out.print(" array " + i + ": " + array[i]);
        }

        double sumNeg = 0;
        double maxPos = 0;
        double minNeg = 0;
        int iPosMin = 0;
        int iPosMax = 0;

        for (int i = 0; i < count; i++) {
            if (array[i] < 0) {
                sumNeg += array[i];
                if (array[i] < minNeg) {
                    minNeg = array[i];
                    iPosMin = i;
                }
            } else {
                if (array[i] > maxPos) {
                    maxPos = array[i];
                    iPosMax = i;
                }
            }
        }
        System.out.println("Индекс минимального числа : " + iPosMin);
        System.out.println("Индекс максимального числа: " + iPosMax);
        System.out.println("Сумма отрицательных чисел : " + sumNeg);

        int iPosTmp;
        double comp = 1;
        if (iPosMin != iPosMax) {
            if (iPosMin > iPosMax) {
                iPosTmp = iPosMax;
                iPosMax = iPosMin;
                iPosMin = iPosTmp;
            }
            for (int i = iPosMin; i <= iPosMax; i++) {
                comp *= array[i];
            }
            System.out.println(" Произведение между максимальным/минимальным числами = " + comp);
        }
        else {
            System.out.println(" Индекс минимального числа равен индексу максимального числа = " + comp);
        }
    }
}
