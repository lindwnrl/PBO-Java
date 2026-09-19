package Jobsheet3.Container;

public class Container {
    private String nama,kode;
    private double kapasitasMax,tambahan,kurangan;
    private double beratMuatanSaatIni = 0;

    public Container(String kode, String nama, double kapasitasMax){
        this.kode = kode;
        this.nama = nama;
        this.kapasitasMax = kapasitasMax;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public double getKapasitasMax(){
        return kapasitasMax;
    }

    public double checkMuatan(){
        return  beratMuatanSaatIni;
    }

    public double tambahMuatan(double tambahan){
        if (tambahan > kapasitasMax ) {
            System.out.println("Nyuwun pangapunten, nanging panjenengan mboten saged nglampahi punika");
        }else{
            this.tambahan = tambahan;
            beratMuatanSaatIni += tambahan;
        }
       return beratMuatanSaatIni;
    }

    public double turunkanMuatan(double kurangan){
        if (kurangan > (beratMuatanSaatIni / 2)) {
            System.out.println("Nyuwun pangapunten, kanggé njagi kaslametan, mboten dipunparengaken mbongkar muatan langkung saking 50% saking muatan ingkang samenika wonten!");
        }else {
            this.kurangan = kurangan;
            beratMuatanSaatIni -= kurangan;
        }
        return beratMuatanSaatIni;
    }
}
