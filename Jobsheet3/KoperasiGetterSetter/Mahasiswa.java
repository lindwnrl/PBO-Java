package Jobsheet3.KoperasiGetterSetter;
public class Mahasiswa {
    private String nama , alamat;
    private  float simpanan;

    Mahasiswa(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan =0;
    }
    public void setNama(String name){
        this.nama = name;
    }
    public void setAlamat(String address){
        this.alamat = address;
    }
    public String getNama(){
        
        return nama; 
    }
    public String getAlamat(){

        return alamat;
    }
    public float getSimpanan(){
        return simpanan;
    }
    public void setor(float money){
        simpanan += money;
    }
    public void pinjam(float money){
        simpanan -= money;
    }
}
