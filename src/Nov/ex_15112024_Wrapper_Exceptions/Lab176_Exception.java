package Nov.ex_15112024_Wrapper_Exceptions;

import java.io.FileInputStream;

public class Lab176_Exception {
    public static void main(String[] args) {

        //checked
        //FileInputStream fis = new FileInputStream("c:a.txt");
        //JVM knows that exception miight occur


        //unchecked
        int a=10;
        int b=a/0;
        System.out.println(b);
    }
}
