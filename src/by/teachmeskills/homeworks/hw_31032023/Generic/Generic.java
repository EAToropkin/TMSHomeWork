package by.teachmeskills.homeworks.hw_31032023.Generic;

import java.util.Arrays;

public class Generic<T> {
    final static int defaultSize = 10;
    private int sizeArray;
    private T[] array;

    public Generic(int size) {
        array = (T[]) new Object[size];
        sizeArray = size;
    }

    public Generic() {
        array = (T[]) new Object[defaultSize];
        sizeArray = defaultSize;
    }

    public void add(int index, T element) {

        if (index < 0) {
            return;
        }
        // если преедали существующий индекс - обновляем элемент, иначе  добавляем последним элементом массива
        if (index <= sizeArray - 1) {
            array[index] = element;
        } else {
            T[] newArray = Arrays.copyOf(array, array.length + 1);
            newArray[newArray.length - 1] = element;
            array = newArray;
        }
    }

    public void remove(int index) {
        if ((index < 0) || (index >= array.length)) {
            return;
        }

        for (int i = index; i < sizeArray; i++) {
            array[i] = array[i + 1];
        }
        sizeArray--;
        array[sizeArray] = null;
    }

    public T get(int index) {
        if ((index < 0) || (index >= array.length)) {
            return null;
        }

        return array[index];
    }

    public boolean check(T element) {
        for (int i = 1; i < sizeArray; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void removeAll() {
        for (int i = 0; i < sizeArray; i++) {
            array[i] = null;
            sizeArray--;
        }
    }

}
