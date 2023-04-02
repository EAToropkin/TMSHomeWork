package by.teachmeskills.homeworks.hw_17032023.Auto;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Automobile autoToyota = new Automobile("Toyota", 180, 3200000);

        FileOutputStream outputStream = new FileOutputStream("C:/TM_Java_Lesson/FileTest/Serialize.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(autoToyota);

        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("C:/TM_Java_Lesson/FileTest/Serialize.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Automobile auto = (Automobile) objectInputStream.readObject();

        System.out.println(auto);
    }
}
