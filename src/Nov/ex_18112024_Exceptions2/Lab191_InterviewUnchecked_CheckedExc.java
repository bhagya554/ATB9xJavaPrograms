package Nov.ex_18112024_Exceptions2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab191_InterviewUnchecked_CheckedExc {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;//unchecked
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Unchecked");
        }

        try {
            FileInputStream fis = new FileInputStream(new File("c://abc.txt"));
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Checked");
        }
    }
}
