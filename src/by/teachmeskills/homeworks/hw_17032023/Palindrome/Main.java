package by.teachmeskills.homeworks.hw_17032023.Palindrome;

import static by.teachmeskills.homeworks.hw_17032023.FilePaths.fileTestPath;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static boolean isPalindrome(String str) {
        if (!str.isEmpty()) {

            StringBuilder word = new StringBuilder(str);
            if ((!word.isEmpty()) && (word.length() > 3)) {

                StringBuilder reverseWord = word.reverse();

                if (reverseWord.toString().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String fileReadName = fileTestPath + "Text.txt";
        String fileWriteName = fileTestPath + "TextWrite.txt";

        File fileRead = new File(fileReadName);
        ArrayList<String> arrayList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileRead))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {

                if (isPalindrome(line)) {
                    arrayList.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (arrayList.size() != 0) {
            try {
                File fileWrite = new File(fileWriteName);

                if (!fileWrite.exists()) {
                    fileWrite.createNewFile();
                }

                FileWriter fw = new FileWriter(fileWrite, true);
                System.out.println("Слова палиндромы:");
                try (BufferedWriter bw = new BufferedWriter(fw)) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        String str = arrayList.get(i);
                        bw.write(str);
                        System.out.println(str);
                    }
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            } catch (IOException ioe) {
                System.out.println("Ошибка при записи файла:");
                ioe.printStackTrace();
            }
        }
    }
}