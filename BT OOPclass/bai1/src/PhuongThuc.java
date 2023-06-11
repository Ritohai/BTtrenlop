public class PhuongThuc {
    Hcn hcn;

    public PhuongThuc(Hcn hcn) {
        this.hcn = hcn;
    }

    public Hcn getHcn() {
        return hcn;
    }

    public void setHcn(Hcn hcn) {
        this.hcn = hcn;
    }

    public double DienTich() {
        double DienTich = this.hcn.getHeight() * this.hcn.getWidth();
        return DienTich;
    }
    public double ChuVi(){
        double CV = 2*(this.hcn.getWidth() + this.hcn.getHeight());
        return CV;
    }
}