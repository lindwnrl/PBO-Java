package Jobsheet3.MotorEncapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    private boolean btsKecepatan = false;

    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if (kontakOn == true && batasKecepatan() == true) {
            kecepatan += 10;
        }else if (kontakOn == true && batasKecepatan() == false) {
            System.out.println("Kecepatan maksimal hanya 100");
        }else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off");
        }
    }

    public boolean batasKecepatan(){
        if (kecepatan == 100) {
            btsKecepatan = false;
        }else{
            btsKecepatan = true;
        }
        return  btsKecepatan;
    }
    public void kurangiKecepatan(){
        if (kontakOn == true) {
            kecepatan -= 5;
        }else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off \n" );
        }
    }
    public void printStatus(){
        if (kontakOn == true) {
            System.out.println("Kontak On");
        }else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan : " + kecepatan + "\n");
    }
}
