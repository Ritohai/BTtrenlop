import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao gia tri a: ");
        Double a = scanner.nextDouble();
        System.out.println("Nhap gia tri b: ");
        Double b = scanner.nextDouble();
        System.out.println("Nhap gia tri c: ");
        Double c = scanner.nextDouble();
        PtBac2 pt2 = new PtBac2(a,b,c);
        PhuongThuc kt = new PhuongThuc(pt2);
//        if(kt.Delta()>0){
//            System.out.println("Phuong trinh co nghiem 1: "+ kt.Nghiem1(kt.Delta()));
//            System.out.println("Phuong trinh co nghiem 2: "+ kt.Nghiem2(kt.Delta()));
//        } else if (kt.Delta() == 0 ) {
//            System.out.println("Phuong trinh co nghiem kep: " + kt.NghiemKep(kt.Delta()));
//        } else {
//            System.out.println("Phuong trinh vo nghiem.");
//        }
        if(kt.Delta() > 0){
            System.out.println("Phuong trinh co nghiem 1: "+ kt.NghiemT1());
            System.out.println("Phuong trinh co nghiem 2: "+ kt.NghiemT2());
        } else if (kt.Delta() == 0 ) {
            System.out.println("Phuong trinh co nghiem kep: " + kt.NgiemKep());
        } else {
            System.out.println("Phuong trinh vo nghiem.");
        }
    }
}