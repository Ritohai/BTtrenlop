import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập số phần tử của mảng: ");
            int num = scanner.nextInt();
            int[] array = new int[num];
            System.out.print("Nhập các phần tử của mảng (theo thứ tự tăng dần): ");
            for (int i = 0; i < num; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.print("Nhập phần tử cần tìm: ");
            int target = scanner.nextInt();

            int result = binarySearch(array, target);

            if (result != -1) {
                System.out.println("Phần tử " + target + " được tìm thấy tại vị trí " + result);
            } else {
                System.out.println("Không tìm thấy phần tử " + target + " trong mảng.");
            }
        } catch (Exception e) {
            System.out.println("Đang có lỗi.");
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
