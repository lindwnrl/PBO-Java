package Jobsheet6.id.ac.polinema.Tugas1;

public class Main1 {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai("1", "Budi", "Jl.Biji");
        Pegawai p2 = new Pegawai("2", "Eko", "Jl.Taoh");
        Pegawai p3 = new Pegawai("3", "Alex", "Jl.Lek");

        Dosen d1 = new Dosen("1", "Rahmad", "Jl.Niggy", 20);
        Dosen d2 = new Dosen("2", "Anjar", "Jl.Elang", 18);

        DaftarGaji d = new DaftarGaji(5);

        d.addPegawai(p1);
        d.addPegawai(p2);
        d.addPegawai(d1);
        d.addPegawai(d2);

        d.printSemuaGaji();
    }
}
