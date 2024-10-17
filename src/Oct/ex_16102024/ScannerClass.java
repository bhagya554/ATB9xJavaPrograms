package Oct.ex_16102024;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        System.out.println(age>25?"Allowed to go to Goa":"Not allowed to go to Goa");
        sc.close();
    }
}
