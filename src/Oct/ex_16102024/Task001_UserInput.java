package Oct.ex_16102024;

import java.util.Scanner;

public class Task001_UserInput {
    public static void main(String[] args) {
        /*
        Task 1: Take a user input - Name, Age and Salary and print them in the end.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.printf("Name is: %s\n",name);
        System.out.printf("Age is: %d\n",age);
        System.out.printf("Salary is: %f\n",salary);

    }
}
