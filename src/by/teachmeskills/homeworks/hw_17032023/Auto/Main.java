package by.teachmeskills.homeworks.hw_17032023.Auto;

import java.io.FileInputStream;

import static by.teachmeskills.homeworks.hw_17032023.FilePaths.fileTestPath;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String fileName = fileTestPath + "Serialize.txt";
        Automobile autoToyota = new Automobile("Toyota", 180, 3200000);

        try (FileOutputStream outputStream = new FileOutputStream(fileName);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);) {
            objectOutputStream.writeObject(autoToyota);
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Automobile auto = (Automobile) objectInputStream.readObject();
            System.out.println(auto);
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}