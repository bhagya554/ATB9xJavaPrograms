package Oct.ex_16102024;

import java.util.Scanner;

public class Lab008_ScannerClass {
    public static void main(String[] args) {
        /*
        If age>18 -- go to Goa
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        System.out.println(age>25?"Allowed to go to Goa":"Not allowed to go to Goa");
        sc.close();
    }
}
