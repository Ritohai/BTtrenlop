import java.util.Arrays;
import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài dữ liệu: ");
        int num = Integer.parseInt(scanner.nextLine());
        int[] array = new int[num];
        int sum = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("phan tu so" + (i + 1));
            String value = scanner.nextLine();
            try {
                array[i] = Integer.parseInt(value);
            } catch (Exception e) {
                System.err.println("bo qua ");
            }
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(sum);
    }
}