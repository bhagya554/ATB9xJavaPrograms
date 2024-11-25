package Nov.ProgrammingQuestions;

import java.util.Scanner;

public class PalidromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value to verify whether its a palindrome");
        String input = sc.nextLine();//1
        String output="";//1
        for(int i=input.length()-1;i>=0;i--){
            output = output+input.charAt(i);//n-1
        }
        if(output.equals(input)){//1
            System.out.println("Palindrome");//1
        }
        else{//1
            System.out.println("Not a Palindrome");//1
        }

    }

    /*
    TC: o(n)
    SC:o(n)

    */
}
