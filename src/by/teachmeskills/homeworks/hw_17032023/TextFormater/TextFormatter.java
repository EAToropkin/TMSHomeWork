package by.teachmeskills.homeworks.hw_17032023.TextFormater;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static by.teachmeskills.homeworks.hw_17032023.Palindrome.Main.isPalindrome;

public class TextFormatter {

    private String filePathFrom;
    private String filePathTo;

    public TextFormatter(String filePathFrom, String filePathTo) {
        this.filePathFrom = filePathFrom;
        this.filePathTo = filePathTo;
    }

    private static Integer getCountWord(String str) {
        int count = 0;

        if (!str.isEmpty()) {
            count++;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isFindPalindrome(String sent) {
        if (!sent.isEmpty()) {
            String[] arrWord = sent.split(" ");
            for (String word : arrWord) {
                if (isPalindrome(word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void processFile() {
        File fileRead = new File(this.filePathFrom);
        ArrayList<String> arrayList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileRead))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {

                String[] sentenceArr = line.split("\\.");
                for (String sentence : sentenceArr) {
                    sentence = sentence.trim();
                    int cntWord = getCountWord(sentence);
                    if ((isFindPalindrome(sentence)) || ((cntWord >= 3) && (cntWord <= 5))) {
                        arrayList.add(sentence);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (arrayList.size() != 0) {
            try (FileOutputStream fileTo = new FileOutputStream(this.filePathTo, false)) {
                for (int i = 0; i < arrayList.size(); i++) {
                    String str = arrayList.get(i) + "\n";
                    fileTo.write(str.getBytes());
                }
                fileTo.close();
            } catch (IOException ioe) {
                System.out.println("Ошибка при записи файла:");
                ioe.printStackTrace();
            }
        }
    }
}