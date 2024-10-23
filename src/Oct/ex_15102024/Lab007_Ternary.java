package Oct.ex_15102024;

public class Lab007_Ternary {
    public static void main(String[] args) {
        /*
        Nested Ternary
        result = condition 1?expression 1:(condition 2?expression 2:expression3)

        If Score --90 or above, grade is "A"
        If Score 80--89 or above, grade is "B"
        If Score 70--79 or above, grade is "C"
        If Score 60--69 or above, grade is "D"
        If Score <60 or above, grade is "F"
         */
        int marks = 65;
        String grade = marks >= 90 ? "A" :
                (marks >= 80 && marks <= 89) ? "B" :
                        (marks >= 70 && marks <= 79) ? "C" :
                                (marks >= 60 && marks <= 69) ? "D": "F";
        System.out.printf("Your grade is: %s",grade);
    }
}
