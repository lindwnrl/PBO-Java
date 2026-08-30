public class SupraX100 extends BeatStreet {
    private int gear;

    public void setGear(int iniGear){
        gear = iniGear;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jumlah Gigi " + gear);
    }
}
