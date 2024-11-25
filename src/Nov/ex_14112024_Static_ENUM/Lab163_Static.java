package Nov.ex_14112024_Static_ENUM;

public class Lab163_Static {
    public static void main(String[] args) {

        Student s1 = new Student(45);
        Student s2 = new Student(12);
        Student s3 = new Student(67);
        Student s4;
        System.out.println(Student.schoolName);
        Student.schoolName="XYZ";
        System.out.println(Student.schoolName);
        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);



    }



}

class Student{
    int age;//non static variable or Instance variable
    static String schoolName="ABC";//static variable

    Student(int age){
        this.age=age;
    }

    {
        System.out.println("IIB - Instance Initialization Block");
        System.out.println("Executes the block of code whenever an object is created");
        System.out.println("Read MySQl db");
    }

    static {
        System.out.println("SIB - Static Initialization Block");
        System.out.println("Loaded once, When class is loaded");
        System.out.println("Read excel file");

    }
}