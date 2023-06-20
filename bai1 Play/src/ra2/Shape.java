package ra2;

public abstract class Shape {
    private  String color;

     public Shape() {
     }

     public Shape(String color) {
          this.color = color;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }
     abstract double getArea();
     public String display(){
           return  " | Color: "+color;
     }

}
