package Nov.ex_18112024_Exceptions2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab192_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        //Throws - Checked Exception
        FileInputStream fis = new FileInputStream(new File("c://abc.txt"));
    }
}
