package Jobsheet3.Bioskop;

public class PeliculaDemo {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("Human Centipede", -2);
        System.out.println("Film : " + p1.getJudulFilm());
        System.out.println("Harga Tiket : " + p1.getHargaDasar());
        System.out.println("Status Lunas? : " + p1.isStatusPembayaran());

        System.out.println();
        System.out.println("Memproses pembayaran.....");
        p1.lakukanPembayaran();
        System.out.println("Status Lunas Terbaru? : " + p1.isStatusPembayaran());
    }
}
