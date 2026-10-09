package Jobsheet6.id.ac.polinema.Tugas2;

public class TelevisiModern extends Televisi {
    private String modeTampilan;
    private String dvd;

    public TelevisiModern(String merk,int jumlahChannel){
        super(merk, jumlahChannel);
    }

    public void gantiModusTampilan(String mode){

    }

    public void masukkanDVD(String judul){
        this.dvd = judul;
    }

    public void mainkanDVD(){
        if (dvd == null) {
            System.out.println("Tidak memainkan apa-apa");
        }else{
            System.out.println("Memainkan " + dvd);
        }
    }
}
