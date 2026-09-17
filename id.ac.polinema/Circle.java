public class Circle {
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        double area = Math.PI * (radius * radius);
        return  area;
    }

    public double circumference(){
        double circumference = 2 * Math.PI * radius;
        return  circumference;
    }
}
