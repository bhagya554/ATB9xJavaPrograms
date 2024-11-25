package Nov.ex_15112024_Wrapper_Exceptions;

public class Lab179_Exception {
    public static void main(String[] args) {

        System.out.println("Start execution");
        int c=0;
        int b=0;
        try {
            b=10/c;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
        System.out.println("END");
    }
}
