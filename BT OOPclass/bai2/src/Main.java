import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao bán kính: ");
        Double r = sc.nextDouble();
        PhuongThuc dientich = new PhuongThuc(r);
        System.out.println("Dien tich : " + dientich.Dientich());
        System.out.println("Chuvi : " + dientich.Chuvi());
    }
}