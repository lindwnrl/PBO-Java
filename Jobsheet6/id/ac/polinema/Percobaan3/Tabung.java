package Jobsheet6.id.ac.polinema.Percobaan3;

public class Tabung extends Bangun {
    protected int t;
    protected int r = 5;

    public void setSuperPi(double pi){
        this.pi = pi;
    }
    public void setSuperR(int r){
        super.r = r;
    }
    public void setT(int t){
        this.t = t;
    }
    public void volume(){
        System.out.println("Volume tabung adalah : " + (super.pi * super.r * super.r * this.t));
    }

    public void cekR(){
        System.out.println("R : " + r);
        System.out.println("this.R : " + this.r);
        System.out.println("super.r : " + super.r);
    }
}
