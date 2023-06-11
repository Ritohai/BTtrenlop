public class PhuongThuc {
    PtBac2 pt;

    public PhuongThuc(PtBac2 pt) {
        this.pt = pt;
    }

    public PtBac2 getPt() {
        return pt;
    }

    public void setPt(PtBac2 pt) {
        this.pt = pt;
    }

    public double Delta() {
        double delta = Math.pow(pt.getB(), 2) - 4 * pt.getA() * pt.getC();
        return delta;
    }
    public double NghiemT1( ){
        double nghiemT1 = (-pt.getB()+ Math.sqrt(Delta()))/(2*pt.getA());
        return nghiemT1;
    }
    public double NghiemT2( ){
        double nghiemT2 = (-pt.getB()- Math.sqrt(Delta()))/(2*pt.getA());
        return nghiemT2;
    }
    public double NgiemKep(){
        double NgiemKep = (-pt.getB())/(2*pt.getA());
        return NgiemKep;
    }
}

