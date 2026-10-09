package Jobsheet6.id.ac.polinema.Percobaan5;

public class MainPercobaan {
    public static void main(String[] args) {
        
        Desktop desk = new Desktop("Dell OptiPlex 7090", 51200, 3200, "Canon");
        Laptop lap = new Laptop("Dell Inspiron", 51200, 3200,1080);
        
        desk.showInfo();
        System.out.println();
        lap.showInfo();
        System.out.println();
        desk.nyalakanKomputer();
    }
}

