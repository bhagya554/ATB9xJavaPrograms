package Nov.ex_18112024_Exceptions2;

public class Lab183_Exception {
    public static void main(String[] args) {
        int a=10;
        int c=0;
        String s1=null;
        try {
            s1.trim();
            c=a/0;

        } catch (ArithmeticException|NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);

    }
}
