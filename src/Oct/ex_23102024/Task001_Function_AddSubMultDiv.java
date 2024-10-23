package Oct.ex_23102024;

import java.util.Scanner;

/*
Create a Function of Sub, Sum, Mul and Div with parameter, a, b (take the parameter from the User)

3 → user input
4 - user input

sum(3,4)
 */
public class Task001_Function_AddSubMultDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value:");
        int a = sc.nextInt();
        System.out.println("Enter Second value:");
        int b = sc.nextInt();

        System.out.println("Addition: " + add(a,b));
        System.out.println("Subtraction: " + sub(a,b));
        System.out.println("Multiplication: " + mult(a,b));
        System.out.println("Division: " + divide(a,b));

    }

    static int add(int a,int b){
        return a+b;
    }

    static int sub(int a,int b){
        return a-b;
    }
    static int mult(int a,int b){
        return a*b;
    }
    static int divide(int a,int b){
        return a/b;
    }

}
