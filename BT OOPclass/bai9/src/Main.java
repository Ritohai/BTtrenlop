import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product dm1 = new Product(1,"quan");
        Product dm2 = new Product(2,"ao");
        //San pham đanh muc 1
        Category category1 = new Category(1,"ao",11332f,dm1);
        Category category2 = new Category(2,"ao ngan",11332f,dm1);
        Category category3 = new Category(3,"ao dai",100f,dm1);
        //San pham đanh muc 1
        Category category4 = new Category(1,"quan",1232f,dm2);
        Category category5 = new Category(2,"quan2", 1010f,dm2);
        Category category6 = new Category(3,"quan3",500f,dm2);
        System.out.println("Tat ca san pham:");
        category1.display();
        category2.display();
        category3.display();
        category4.display();
        category5.display();
        category6.display();
    }
}