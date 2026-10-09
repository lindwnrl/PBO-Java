package Jobsheet6.id.ac.polinema.Percobaan5;

public class Komputer {
    protected String merk;
    protected int kapasitasMemory,kecepatanCPU;

    public Komputer(String merk, int memory,int cpu){
        this.merk = merk;
        this.kapasitasMemory= memory;
        this.kecepatanCPU = cpu;
    }

    public void showInfo(){
        System.out.println("Merk               : " + merk );
        System.out.println("Kapasitas Memory   : " + kapasitasMemory + " MB");
        System.out.println("Kecepatan CPU      : " + kecepatanCPU + " MHz");
    }

    public void nyalakanKomputer(){
        System.out.println("Komputer " + merk + " dinyalakan");
    }
}
