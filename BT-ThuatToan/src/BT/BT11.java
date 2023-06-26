package BT;

import java.util.Scanner;

public class BT11 {
    public static void main(String[] args) {
        double [] arr = {2.5,4.7,5.8,7.9,10.4,15.8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần tìm:");
        double num = sc.nextDouble();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                System.out.println("Số:  "+ num +"ở vị trí "+ i );
            }
        }
    }
}
