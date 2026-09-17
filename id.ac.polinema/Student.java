public class Student {
    String name , studentId;
    double gpa;

    Student(String name, String studentId,double gpa){
        this.name = name;
        this.gpa = gpa;
        this.studentId = studentId;
    }
    public String describe(){
        return name + " ( " + studentId + " | GPA : " + gpa + " ) ";
    }
}
