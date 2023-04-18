package by.teachmeskills.homeworks.hw_31032023.Streams;

import static by.teachmeskills.homeworks.hw_31032023.FilePaths.logPath;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ValidatePath {

    ArrayList<String> arrayPath;

    public ValidatePath(ArrayList<String> arrayPath) {
        this.arrayPath = arrayPath;
    }

    private String validateNum(String docNum) {
        String result = "valid";

        if (!docNum.isEmpty()) {
            if (docNum.length() != 15) {
                result = "invalid: Длина номера не равна 15-ти символам";
            } else if ((!docNum.startsWith("docnum")) && (!docNum.startsWith("contract"))) {
                result = "invalid: Номер должен начинатся с 'docnum' или 'contact'";
            } else if (!docNum.matches("^[a-zA-Z0-9]*$")) {
                result = "invalid: Номер должнен содержать только цифры или латинские буквы";
            }
        }
        return result;
    }

    public void validate() {

        Map<String, String> listNumDog = new HashMap<>();

        if (this.arrayPath.size() == 0) {
            return;
        }
        for (String path : this.arrayPath) {
            File file = new File(path);
            if (file.isFile()) {

                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        listNumDog.put(line, validateNum(line));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        Path path = Paths.get(logPath);

        try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(path))) {
            for (String key : listNumDog.keySet()) {
                String str = key + ": " + listNumDog.get(key) + "\n";
                byte data[] = str.getBytes();
                out.write(data, 0, data.length);
            }

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}