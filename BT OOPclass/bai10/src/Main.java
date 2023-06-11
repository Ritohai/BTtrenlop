import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri a: ");
        Double a = sc.nextDouble();
        System.out.println("Nhap gia tri b: ");
        Double b = sc.nextDouble();
        Declare declare = new Declare(a,b);
        Calculator calculator = new Calculator(declare);
        System.out.println("Kq add: " + calculator.add());
        System.out.println("Kq sub: "+calculator.sub());
        System.out.println("Kq mul: "+calculator.multi());
        System.out.println("Kq div: "+calculator.div());
    }
}