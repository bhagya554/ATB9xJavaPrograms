package Oct.ex_06112024;

import java.util.Scanner;

public class ConstructorDemo_1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter model name:");
        String model_input=sc.nextLine();
        System.out.println("Enter year:");
        int year=sc.nextInt();
        Car2 t1 = new Car2(model_input,year);
       t1.display();

        Car2 t2 = new Car2("BMW",2023);
       // System.out.println(t2.model + " " + t2.year);
        t2.display();
    }
}
 class Car2 {
    String model;
    int year;

    Car2(String model,int year){
        this.model=model;
        this.year=year;
    }

    public void display(){
        System.out.println("Car Details: " + model + "--->" + year);
    }
}

