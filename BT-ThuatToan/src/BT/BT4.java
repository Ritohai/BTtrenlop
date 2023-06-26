package BT;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 6, 65, 8, 9, 7, 50, 52};
        System.out.println("Nhập giá trị cần tìm kiếm: ");
        int number = new Scanner(System.in).nextInt();
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                System.out.println("Giá trị " + number + " có tồn tại và nằm ở vị trí " + i);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy");
        }
    }
}
