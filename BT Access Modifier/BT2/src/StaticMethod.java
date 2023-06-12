public class StaticMethod {
   static Double PI = 3.14;

    public static Double calCircleArea(double R) {
        double cal = Math.pow(R, 2) * PI;
        return cal;
    }

    public static double	calTriangleArea(double a, double b, double c) {
        double p = (a+b+c)/(2);
        double calTri = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return calTri;
    }
    public static double	calRectangleArea(double width,double height){
        double calRec = width*height;
        return calRec;
    }
}
