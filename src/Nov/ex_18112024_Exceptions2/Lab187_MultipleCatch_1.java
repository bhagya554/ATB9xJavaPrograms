package Nov.ex_18112024_Exceptions2;

public class Lab187_MultipleCatch_1 {
    public static void main(String[] args) {
        try {
            String s1=args[0];//java.lang.ArrayIndexOutOfBoundsException
            int a= Integer.parseInt(s1);//java.lang.NumberFormatException
            int b=10/0;//java.lang.ArithmeticException
            System.out.println(b);
        } catch (NumberFormatException|ArrayIndexOutOfBoundsException|ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        finally {

            System.out.println("END");
        }


    }
}
