package Jobsheet3.Container;

import java.util.Scanner;

public class ContainerDemo {
    public static void main(String[] args) {
        Container containerAlfa = new Container("Miau", "PT.Doksli", 50000);
        Scanner sc = new Scanner(System.in);

        System.out.println("Nama Pemilik Kontainer : " + containerAlfa.getNama());
        System.out.println("Kapasitas Maksimal : " + containerAlfa.getKapasitasMax() + " Kg");

        System.out.println();

       System.out.println("Masukkan muatan baru (Kg) : ");
       double muatan = sc.nextDouble();

       containerAlfa.tambahMuatan(muatan);
       System.out.println("Berat muatan saat ini : " + containerAlfa.checkMuatan() + " Kg");
       
       System.out.println("Masukkan muatan baru (Kg) : ");
       muatan = sc.nextDouble();

       containerAlfa.tambahMuatan(muatan);
       System.out.println("Berat muatan saat ini : " + containerAlfa.checkMuatan() + " Kg");

       System.out.println("Turunkan muatan (Kg : )");
       muatan = sc.nextDouble();

       containerAlfa.turunkanMuatan(muatan);
       System.out.println("Berat muatan saat ini : " + containerAlfa.checkMuatan() + " Kg");
    }
}
