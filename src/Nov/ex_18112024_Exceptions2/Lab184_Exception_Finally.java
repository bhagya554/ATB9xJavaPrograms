package Nov.ex_18112024_Exceptions2;

public class Lab184_Exception_Finally {
    public static void main(String[] args) {
        int a=10;
        int c=0;
        String s1=null;
        try {
            s1.trim();
            c=a/0;
            System.out.println(c);

        } catch (ArithmeticException|NullPointerException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I will always execute");
        }

    }
}
