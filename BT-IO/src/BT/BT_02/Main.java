package BT.BT_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "Gtext.txt";

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            int lineCount = 0;

            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lineCount++;
            }

            System.out.println("Số dòng trong file: " + lineCount);

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
