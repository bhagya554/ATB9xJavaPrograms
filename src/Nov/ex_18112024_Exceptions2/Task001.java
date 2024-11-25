package Nov.ex_18112024_Exceptions2;

import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.ArithmeticException;
import java.lang.NullPointerException;

class Task001{
public static void main(String args[]){

String s1 = "Pramod";
String a1=null;
try{
 a1 = args[0];
 int a = 10 / 0;
 s1 = null;
}

catch(ArrayIndexOutOfBoundsException|ArithmeticException|NullPointerException e){
System.out.println(e.getMessage());
}


           
}
}