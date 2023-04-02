package by.teachmeskills.homeworks.hw_17032023.ValidateText;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ValidateText {
    public static void main(String[] args) {
        File blackListFile = new File("C:/TM_Java_Lesson/FileTest/BlackList.txt");
        File textFile = new File("C:/TM_Java_Lesson/FileTest/Text.txt");
        ArrayList<String> blackList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(blackListFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    blackList.add(line.toUpperCase());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (blackList.size() != 0) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(textFile))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    if (!line.isEmpty()) {
                        String[] wordList = line.split(" ");
                        for (String word : wordList) {
                            if (blackList.contains(word.toUpperCase())) {
                                System.out.println("Текст не прошел проверку: " + word);
                                return;
                            }
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Текст прошел проверку");
        }
    }
}
