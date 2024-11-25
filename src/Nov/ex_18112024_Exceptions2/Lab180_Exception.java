package Nov.ex_18112024_Exceptions2;

public class Lab180_Exception {
    public static void main(String[] args) {
        int a=10;
        int c=0;
        try {
            c=a/0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);

    }
}
