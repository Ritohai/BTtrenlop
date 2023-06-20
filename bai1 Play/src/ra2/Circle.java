package ra2;

public class Circle extends Shape{
    private double width;

    public Circle() {
    }

    public Circle(double width) {
        this.width = width;
    }



    public Circle(double width, String color) {
        super(color);
        this.width = width;
    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double getArea() {
        return width*2*Math.PI;
    }
}
