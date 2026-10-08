public class KorekDemo {
    public static void main(String[] args) {
        KorekIjo korek1 = new KorekIjo();
        KorekBening korek2 = new KorekBening();

        korek1.liatHarga(2000);
        korek1.checkGas();
        korek1.nyalaEnggak();
        korek1.printInfo();

        System.out.println();
        
        korek2.liatHarga(3500);
        korek2.checkGas();
        korek2.nyalaEnggak();
        korek2.printInfo();


    }
}
