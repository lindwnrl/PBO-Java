public class MotorDemo {
    public static void main(String[] args) {
      BeatStreet motor1 = new BeatStreet();
      SupraX100 motor2 = new SupraX100();
      
      motor1.setBrand("BeatStreet");
      motor1.checkBensin();
      motor1.checkMesin();
      motor1.berangkat();
      motor1.printInfo();

      System.out.println();

      motor2.setBrand("SupraX100");
      motor2.checkBensin();
      motor2.checkMesin();
      motor2.berangkat();
      motor2.setGear(1);
      motor2.printInfo();
    }
}
