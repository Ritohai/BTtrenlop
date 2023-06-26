package BT;


import java.util.*;

public class BT6 {
    public static void main(String[] args) {
        Integer[] a = getArr();
        System.out.println(Arrays.toString(a));
        System.out.println("Nhập giá trị cần tìm: ");


        int number = new Scanner(System.in).nextInt();
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (number == a[mid]) {
                System.out.println("Vị trí của "+number+ " ở vị trí: "+mid);
                System.exit(0);
            } else if (number > a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Không có");
    }

    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }


}
