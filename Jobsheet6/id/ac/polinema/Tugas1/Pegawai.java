package Jobsheet6.id.ac.polinema.Tugas1;

public class Pegawai {
    protected String nip,nama,alamat;


    protected Pegawai(String nip, String nama, String alamat){
        this.nama = nama;
        this.nip = nip;
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }

    public int getGaji(){
        return 1500000;
    }
}
