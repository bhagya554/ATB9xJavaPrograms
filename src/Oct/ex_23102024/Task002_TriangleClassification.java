package Oct.ex_23102024;

import java.util.Scanner;

public class Task002_TriangleClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1:");
        int side1=sc.nextInt();
        System.out.println("Enter side2:");
        int side2=sc.nextInt();
        System.out.println("Enter side3:");
        int side3=sc.nextInt();

        if(side1==side2 && side1==side3){
            System.out.println("equilateral Triangle");
        }
        else if(side1==side2 ||side1==side3 || side2==side3){
            System.out.println("isosceles triangle");
        }
        else{
            System.out.println("Scalene triangle");
        }
    }
}
