package Nov.ProgrammingQuestions;

import java.util.Scanner;

public class Palindrome_Sol2 {
    public static void main(String[] args) {
        //madam - m - m
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value to verify whether its a palindrome");
        String input = sc.nextLine();

        if(Palidrome(input))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }

    private static boolean Palidrome(String input) {
        input=input.toLowerCase();
        for(int i=0;i<input.length()/2;i++){
            char start = input.charAt(i);
            char last = input.charAt(input.length()-1-i);

            if(start!=last){
                return false;
            }

        }
        return true;
    }
}
