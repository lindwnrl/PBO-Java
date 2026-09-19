package Jobsheet3.KoperasiGetterSetter;
public class KoperasiDemo {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Iwan Pales", "Jl.Soehat no 10");
        System.out.println("Simpanan " + mahasiswa1.getNama() + " Rp : " + mahasiswa1.getSimpanan());

        mahasiswa1.setNama("Iwan Pales");
        mahasiswa1.setAlamat("Jl.Soehat no 10");
        mahasiswa1.setor(10000);
        System.out.println("Simpanan " + mahasiswa1.getNama() + " Rp : " + mahasiswa1.getSimpanan());

        mahasiswa1.pinjam(5000);
        System.out.println("Simpanan " + mahasiswa1.getNama() + " Rp : " + mahasiswa1.getSimpanan());

    }
}
