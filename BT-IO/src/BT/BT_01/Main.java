package BT.BT_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String filePath = "text.txt";

        try {
            String content = readFile(filePath);
            int wordCount = countWords(content);
            System.out.println("Số lượng từ trong file: " + wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(String filePath) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                contentBuilder.append(line).append(" ");
            }
        }
        return contentBuilder.toString();
    }

    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
}
