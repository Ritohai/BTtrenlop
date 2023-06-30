import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập số thứ nhất: ");
            int num1 = sc.nextInt();
            System.out.println("Nhập số thứ hai: ");
            int num2 = sc.nextInt();
            int total = num1 + num2;
            System.out.println(total);
        }catch (Exception e){
            System.out.println(e.getMessage());
            sc.nextLine();
            main(args);
        }
    }
}
