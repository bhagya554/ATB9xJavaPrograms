package Oct.ex_22102024;

import java.util.Scanner;

public class Task002_CountVowels_Consonants {
    public static void main(String[] args) {
        /*
        Count vowels and consonants in a String
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string value to get count the vowel and consonants");
        String st1 = sc.nextLine();
        int vowelCount=0;
        int consonantCount=0;
        for(int i=0;i<st1.length();i++){
            char c = st1.toLowerCase().charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowelCount=vowelCount+1;
            }
            else if(c==' '){
                continue;
            }
            else{
                consonantCount=consonantCount+1;
            }
        }

        System.out.println("No. of vowels: "  + vowelCount);
        System.out.println("No. of consonants: "  + consonantCount);
    }
}
