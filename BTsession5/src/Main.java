// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        //Viết một chương trình Java nhận một chuỗi từ người dùng và tách các từ trong chuỗi đó.
//        // Sau đó, in ra từng từ trên một dòng.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String chuoi = scanner.nextLine();
        String[] mangTu = chuoi.split(" "); // Tách chuỗi thành một mảng các từ
        System.out.println("Các từ trong chuỗi:");
        for (String tu : mangTu) {
            System.out.println(tu);
        }


    }
}
        