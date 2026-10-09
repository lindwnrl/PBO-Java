package Jobsheet6.id.ac.polinema.Tugas1;

public class DaftarGaji {
    private int jumlah;
    private Pegawai[] listPegawai;

    public DaftarGaji(int jumlah){
        this.jumlah = jumlah;
        this.listPegawai = new Pegawai[jumlah];
    }

    public void addPegawai(Pegawai p){
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] == null) {
                listPegawai[i] = p;
                break;
            }
        }
    }

    public void printSemuaGaji(){
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] != null) {
                System.out.println("Nama : " + listPegawai[i].getNama());
                System.out.println("Gaji : " + listPegawai[i].getGaji());
                System.out.println();
            }
        }
    }
}
