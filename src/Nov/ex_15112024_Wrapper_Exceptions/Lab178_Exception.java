package Nov.ex_15112024_Wrapper_Exceptions;

public class Lab178_Exception {
    public static void main(String[] args) {

        System.out.println("Start execution");
        String s1=null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("END");
    }
}
