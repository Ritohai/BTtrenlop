// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius() + " " + circle.getColor());
        Circle circle2 = new Circle(2.5);
        System.out.println(circle2.getRadius() + " " + circle2.getColor());
    }
}
