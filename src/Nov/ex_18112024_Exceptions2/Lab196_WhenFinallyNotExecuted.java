package Nov.ex_18112024_Exceptions2;

public class Lab196_WhenFinallyNotExecuted {
    public static void main(String[] args) {

        try{
            int a=10/0;
            System.exit(0);
        } catch (Exception e) {
            System.out.println("/ by zero");
        }
        finally {
            System.out.println("Hello");
        }
    }
}
