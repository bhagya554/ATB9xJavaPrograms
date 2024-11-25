package Nov.ex_18112024_Exceptions2;

public class Lab188_MultiTry {
    public static void main(String[] args) {
        String s1=null;
        try {
          s1 =args[0];//java.lang.ArrayIndexOutOfBoundsException

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        try{
            int a= Integer.parseInt(s1);//java.lang.NumberFormatException
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        try{
            int b=10/0;//java.lang.ArithmeticException
            System.out.println(b);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
