package BT;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        System.out.println("Nhập số phần tử của màng: ");
        int arr = new Scanner(System.in).nextInt();
        int[] array = new int[arr];
        System.out.println("Nhập số phần tử của mảng đã sắp xếp tăng dần: ");
        for (int i = 0; i < arr; i++) {
            array[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("Nhập giá trị cần tìm kiếm: ");
        int number = new Scanner(System.in).nextInt();
        int index = binarySearch(array, number);
        if (index != -1) {
            System.out.println("Giá trị " + number + " nằm ở vị trí " + index);
        } else {
            System.out.println("Không tìm thấy " + number);
        }
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key) {
//                    key = array[mid];
                return mid;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


}
