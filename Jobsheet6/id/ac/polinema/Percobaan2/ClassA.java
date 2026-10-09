package Jobsheet6.id.ac.polinema.Percobaan2;

public class ClassA {
    protected int x,y;

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void getNilai(){
        System.out.println("Nilai X : " + x);
        System.out.println("Nilai Y : " + y);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}
