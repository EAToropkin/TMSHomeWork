package by.teachmeskills.homeworks.hw_31032023.Folders;

import static by.teachmeskills.homeworks.hw_31032023.FilePaths.testPathRename;
import static by.teachmeskills.homeworks.hw_31032023.FilePaths.testPath;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    private static void writeFile(Path path) {
        String s = "TestString";
        byte data[] = s.getBytes();

        try (OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(path))) {
            out.write(data, 0, data.length);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        File dir = new File(testPath);

        if (!dir.exists()) {
            dir.mkdir();
            System.out.println(" ");
        }

        Path path1 = Paths.get(testPath + "/file1.txt");
        Path path2 = Paths.get(testPath + "/file2.txt");
        Path path3 = Paths.get(testPath + "/file3.txt");
        writeFile(path1);
        writeFile(path2);
        writeFile(path3);

        File newDir = new File(testPathRename);
        dir.renameTo(newDir);

        if (newDir.exists()) {
            System.out.println(" ");

            for (File file : newDir.listFiles())
                if (!file.isDirectory())
                    file.delete();

            if (newDir.delete()) {
                System.out.println(" ");
            }
        }
    }
}