package BT.BT_08;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BT8 {
    public static void main(String[] args) {
        String sourceFile = "file.txt"; // Đường dẫn tới tệp gốc
        String destinationFile = "Cnewfile.txt"; // Đường dẫn tới tệp đích mới

        String fileContent = readFile(sourceFile);
        if (fileContent != null) {
            String lowercaseContent = fileContent.toLowerCase(); // Chuyển đổi nội dung thành chữ thường

            boolean success = writeFile(destinationFile, lowercaseContent);
            if (success) {
                System.out.println("Tạo bản sao với tên mới và các từ viết thường thành công.");
            } else {
                System.out.println("Không thể tạo bản sao với tên mới và các từ viết hoa.");
            }
        } else {
            System.out.println("Không thể đọc tệp gốc.");
        }
    }

    private static String readFile(String filename) {
        StringBuilder fileContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
            return fileContent.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static boolean writeFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}

