package by.teachmeskills.homeworks.hw_17032023.Palindrome;

import java.io.*;
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

        File fileRead = new File("C:/TM_Java_Lesson/FileTest/Text.txt");
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
                File fileWrite = new File("C:/TM_Java_Lesson/FileTest/TextWrite.txt");

                if (!fileWrite.exists()) {
                    fileWrite.createNewFile();
                }

                FileWriter fw = new FileWriter(fileWrite, true);

                System.out.println("Слова палиндромы:");
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i = 0; i < arrayList.size(); i++) {
                    String str = arrayList.get(i);
                    bw.write(str);
                    System.out.println(str);
                }
                bw.close();
            } catch (IOException ioe) {
                System.out.println("Ошибка при записи файла:");
                ioe.printStackTrace();
            }
        }
    }
}
