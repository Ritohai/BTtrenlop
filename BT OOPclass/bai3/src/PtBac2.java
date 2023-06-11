public class PtBac2 {
    private double a,b,c;

    public PtBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
//    public double Delta() {
//        double delta = Math.pow(b,2) - 4*a*c;
//        return delta;
//    }
//    public double Nghiem1(double delta){
//        double Nghiem1 = ((-b)+(Math.sqrt(delta)))/(2*a);
//        return Nghiem1;
//    }
//    public double Nghiem2(double delta){
//        double Nghiem2 = ((-b)-(Math.sqrt(delta)))/(2*a);
//        return Nghiem2;
//    }
//    public double NghiemKep(double delta){
//        double NghiemKep = (-b)/(2*a);
//        return NghiemKep;
//    }
}