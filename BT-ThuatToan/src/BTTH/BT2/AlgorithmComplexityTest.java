package BTTH.BT2;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi: ");
        String string = new Scanner(System.in).nextLine();
        int[] freq = new int[255];
        for (int i = 0; i < string.length(); i++) {
            int ascii = (int) string.charAt(i);
            freq[ascii] += 1;
        }
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (freq[j] > max) {
                max = freq[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
