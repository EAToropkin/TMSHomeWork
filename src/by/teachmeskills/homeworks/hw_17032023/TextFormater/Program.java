package by.teachmeskills.homeworks.hw_17032023.TextFormater;

public class Program {
    public static void main(String[] args) {
        TextFormatter textFormatter = new TextFormatter("C:/TM_Java_Lesson/FileTest/Text.txt", "C:/TM_Java_Lesson/FileTest/TextWrite.txt");
        textFormatter.processFile();
    }
}
