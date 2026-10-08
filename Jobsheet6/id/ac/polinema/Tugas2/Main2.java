package Jobsheet6.id.ac.polinema.Tugas2;

public class Main2 {
    public static void main(String[] args) {
        TelevisiModern tv = new TelevisiModern("Polytron", 21);
        System.out.println("Channel aktif : " + tv.getChannelAktif());
        tv.pindahChannel(13);
        System.out.println("Channel aktif : " + tv.getChannelAktif());

        tv.gantiModusTampilan("4K");
        tv.mainkanDVD();
        tv.masukkanDVD("Las peliculas peligrosas");
        tv.mainkanDVD();
    }
}
