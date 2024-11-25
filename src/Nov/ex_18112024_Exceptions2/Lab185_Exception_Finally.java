package Nov.ex_18112024_Exceptions2;

import java.util.Scanner;

public class Lab185_Exception_Finally {
    public static void main(String[] args) {
        Scanner sc=null;
        sc = new Scanner(System.in);
        int v=sc.nextInt();
        try {
            int a=10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
            System.out.println("Closing the scanner class");
        }




    }
}
