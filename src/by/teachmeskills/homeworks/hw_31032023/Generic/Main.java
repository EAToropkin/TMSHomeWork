package by.teachmeskills.homeworks.hw_31032023.Generic;

public class Main {
    public static void main(String[] args) {
        GenericList<Integer> array= new GenericList<>(10);
        array.add(1,100);
        array.add(2,200);

        array.remove(2);
        GenericList<Double> arrayDouble = new GenericList<>();
        arrayDouble.add(1, 10.55);
        arrayDouble.add(2, 10.77);
    }
}
