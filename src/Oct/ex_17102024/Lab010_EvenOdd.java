package Oct.ex_17102024;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lab010_EvenOdd
{
    /*
    Take user input. check whether input is even or odd
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter input:");
        int input = sc.nextInt();
        if(input%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }


}
