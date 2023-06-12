package RA;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(1,"lê");
        Student s2 = new Student(2,"hai");
//        System.out.println("In ra: "+ s1);
//        System.out.println("in ra: "+ s2);
        s1.play();
        s2.play();
    }
}