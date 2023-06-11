import java.util.Arrays;

public class Product {
     int categoryId ;
     String categoryName;

    public Product(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
    public void  display(){
        System.out.println("Id sp la: " + categoryId+ ", tên sp la: "+ (categoryName));

    }
}
