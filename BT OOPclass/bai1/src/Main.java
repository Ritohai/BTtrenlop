import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Width: ");
        Double width = sc.nextDouble();
        System.out.println("Nhap Height: ");
        Double height = sc.nextDouble();
        Hcn kt = new Hcn(width, height);
        PhuongThuc dientich = new PhuongThuc(kt);
        System.out.println("Dieeenj tích là: " + dientich.DienTich());
        System.out.println("CHu vi la: "+ dientich.ChuVi());
    }
}