// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Camry","Toyota");
        Car car2 = new Car("F8","Vinfast");
        Car car3 = new Car("F8","Vinfast");
        System.out.println(Car.numberOfCar);
        System.out.println(car1.getName());
        Car car4 = new Car("F1","Ka");
        System.out.println(Car.numberOfCar);
    }
}