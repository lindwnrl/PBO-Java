package Jobsheet6.id.ac.polinema.Tugas1;

public class Dosen extends Pegawai{
    protected int jumlahSKS;
    protected static final int TARIF_SKS = 1000000;

    protected  Dosen(String nip,String nama,String alamat,int jumlahSKS){
        super(nip, nama, alamat);
        this.jumlahSKS = jumlahSKS;
    }
    
    public void setSKS(int jumlahSKS){
        this.jumlahSKS = jumlahSKS;
    }

    public int getSKS(){
        return jumlahSKS;
    }

    @Override 
    public int getGaji(){
        super.getGaji();
        return super.getGaji() + (jumlahSKS * TARIF_SKS);
    }
}
