public class Calculator {
    Declare declare;

    public Calculator(Declare declare) {
        this.declare = declare;
    }
    public double add(){
        double add = declare.getA() + declare.getB();
        return add;
    }
    public double sub(){
        double sub = declare.getA() - declare.getB();
        return sub;
    }
    public double multi(){
        double multi = declare.getA() * declare.getB();
        return multi;
    }
    public double div(){
        double div = declare.getA() / declare.getB();
        return div;
    }
}
