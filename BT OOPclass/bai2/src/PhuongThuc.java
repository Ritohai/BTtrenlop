public class PhuongThuc {
    private double radius;

    public PhuongThuc(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double Dientich(){
        double Dientich = Math.pow(radius,2)*Math.PI;
        return Dientich;
    }
    public double Chuvi(){
        double Chuvi = 2*Math.PI*radius;
        return Chuvi;
    }
}
