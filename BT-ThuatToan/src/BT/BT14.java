package BT;

import java.util.Arrays;
import java.util.Scanner;

public class BT14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập mảng số nguyên từ bàn phím
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        // Bước 2: Sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(arr);

        // Bước 3: Nhập giá trị cần tìm
        System.out.print("Nhập giá trị cần tìm: ");
        int target = scanner.nextInt();

        // Bước 4: Tìm kiếm nhị phân và in ra kết quả
        int index = binarySearch(arr, 0, arr.length - 1, target);
        if (index != -1) {
            System.out.println("Giá trị " + target + " được tìm thấy tại vị trí " + index);
        } else {
            System.out.println("Không tìm thấy giá trị " + target + " trong mảng.");
        }
    }

    public static int binarySearch(int[] arr, int left, int right, int value) {
        if (left > right) {
            return -1; // Giá trị không tồn tại trong mảng
        }

        int middle = (left + right) / 2;

        if (arr[middle] == value) {
            return middle; // Tìm thấy giá trị tại vị trí middle
        } else if (value > arr[middle]) {
            return binarySearch(arr, middle + 1, right, value); // Tìm kiếm bên phải middle
        } else {
            return binarySearch(arr, left, middle - 1, value); // Tìm kiếm bên trái middle
        }
    }

}
