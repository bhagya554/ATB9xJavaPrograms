package Oct.ex_22102024;

import java.util.Scanner;
//Palidrome of String
public class Task003_PalindromeOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string value");
        String st1 = sc.nextLine();
        String rev = "";
        for(int i=st1.length()-1;i>=0;i--){
            rev=rev+st1.charAt(i);
        }
        if(rev.equals(st1)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
