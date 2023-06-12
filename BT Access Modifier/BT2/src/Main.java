
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Double d = StaticMethod.calTriangleArea(3,4,5);
        System.out.println(d);
        Double d2 = StaticMethod.calTriangleArea(4.7,7,6);
        System.out.println(d2);
        double r1 = StaticMethod.calCircleArea(3.5);
        double r2 = StaticMethod.calCircleArea(6);
        System.out.println(""+r1 +"|"+ r2);
        double hcn1 = StaticMethod.calRectangleArea(2.5,6);
        double hcn2 = StaticMethod.calRectangleArea(4,7);
        System.out.println(""+ hcn1 +"|" + hcn2);


    }
}