package by.teachmeskills.homeworks.hw_17032023.TextFormater;

import static by.teachmeskills.homeworks.hw_17032023.FilePaths.fileTestPath;

public class Program {
    public static void main(String[] args) {
        TextFormatter textFormatter = new TextFormatter(fileTestPath + "Text.txt", fileTestPath + "TextWrite.txt");
        textFormatter.processFile();
    }
}