package Nov.ex_14112024_Static_ENUM;

public class Lab165_Static_Real_SIB_IIB {
    public static void main(String[] args) {
    ATB a1 = new ATB("Amit");
    ATB a2= new ATB("Suraj");
    ATB a3 = new ATB("Tushar");
    ATB a4 = new ATB("Balam");
    ATB a5;
    new ATB("bhagya");

    a1.readDocument();
    a2.readDocument();

    //static
    ATB.doAssignment();//Static method
    System.out.println(ATB.courseName);//static variable


    }
}

class ATB{
    {
        System.out.println("IIB");
        /*
        Here we can write code related to starting a browser or anything before starting
        web or api automation
         */
        System.out.println("Reading from CSV file");
    }

    static{
        System.out.println("Load the class? I will execute");
    }

    private  String name;
    private String phone;
    static String courseName = "ATB9x";

    public ATB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /*
    Non static method can access both static variables as well as non static/instance variables
    */
    void readDocument(){
        System.out.println("Non Static Method");
        System.out.println(courseName);
    }

   //static method cannot access non-static variables
    static void doAssignment(){
        //System.out.println(phone);
        System.out.println(courseName);
        System.out.println("Do Assignment");
    }
/*
SIB
Static variable
Static method
IIB
instance variable
instance method
 */

    static class GenAI{
//0.001% used in automation
    }
}


