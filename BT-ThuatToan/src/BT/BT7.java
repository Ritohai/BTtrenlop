package BT;

import java.util.Arrays;
import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        String string = "hello world khan king";
        String[] a = string.split(" ");
        System.out.println(Arrays.toString(a));
        System.out.println("Nhập vào chuỗi cần tìm kiếm: ");
        String str = new Scanner(System.in).nextLine();
        boolean check  = false;
        for (int i = 0; i < a.length; i++) {
            if(a[i].equals(str)) {
                System.out.println(!check);
                System.exit(0);
            }
        }
        System.out.println(check);
    }
}
