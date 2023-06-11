public class Category {
    int productId;
    String productName;
    Float productPrice;
    Product category;

    public Category(int productId, String productName, Float productPrice, Product category) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    public void display() {
        System.out.println("Mã sp: " + productId + "\n," + " tên san pham la:  " + productName + "\n," + " gia san pham la: " + productPrice + "\n," + " Category: " + category.categoryName);
    }
}
