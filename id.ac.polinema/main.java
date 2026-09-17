public class main {
    public static void main(String[] args) {
        rectangle[] r = new rectangle[3];
        r[0] = new rectangle(4, 5);
        r[1] = new rectangle(6, 3);
        r[2] = new rectangle(2, 8);

        for (rectangle i : r){
            System.out.println("Area : " + i.area() + ", Perimeter : " + i.perimeter());
        }
       
        Student s = new Student("Udin", "67", 3.79);
        System.out.println(s.describe());
    }
}
