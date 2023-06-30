
import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        int[] list = {1,3,4,6,8,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần tìm: ");
        int number = scanner.nextInt();
        try {
           int index = findSort(list, number);
            System.out.println("Phần tử: "+number + " tìm thấy ở vị trí "+index);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static int findSort(int[] list, int number) throws Exception{
        int low = 0;
        int high = list.length -1;
        while (low <= high){
            int mid = (low + high) / 2;
            if(list[mid] == number){
                return mid;
            } else if (list[mid] > number) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        throw  new Exception("Không có phần tử");
    }

}
