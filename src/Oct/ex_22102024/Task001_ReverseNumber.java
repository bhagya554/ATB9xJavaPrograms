package Oct.ex_22102024;

import java.util.Scanner;

public class Task001_ReverseNumber {
    public static void main(String[] args) {
//Reverse a Number

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to be reversed6");
        int num = sc.nextInt();
        int rev=0;
        for(int i=num;i>0;i=i/10){
            int rem=i%10;
            rev=rev*10+rem;
        }
        System.out.println(rev);
    }
}
