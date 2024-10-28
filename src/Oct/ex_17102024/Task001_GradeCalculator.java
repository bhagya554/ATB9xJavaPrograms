package Oct.ex_17102024;

import java.util.Scanner;

public class Task001_GradeCalculator {
    public static void main(String[] args) {
        /*
        ✅ Grade Calculator:
// Write a program that calculates and displays the letter grade
// for a given numerical score (e.g., A, B, C, D, or F)
// based on the following grading scale:
//
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score:");
        int score=sc.nextInt();

        if(score>=90 && score<100){
            System.out.println("A");
        }
        else if(score>=80 && score<89){
            System.out.println("B");
        }
        else if(score>=70 && score<79){
            System.out.println("C");
        }
        else if(score>=60 && score<69){
            System.out.println("D");
        }
        else if(score>=0 && score<60 ){
            System.out.println("F");
        }
        else if(score<0 || score>100){
            System.out.println("Invalid input");
        }
    }}


