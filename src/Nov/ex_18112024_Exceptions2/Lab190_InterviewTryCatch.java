package Nov.ex_18112024_Exceptions2;

public class Lab190_InterviewTryCatch {
    public static void main(String[] args) {
        final double pi=3.14;
        int a=0;
        try{
            int x=10/a;
        }
        catch (Exception e){
            System.out.println("div by zero");
        }
        finally {
            System.out.println("I will be executed anyHow!!");
        }
    }
}
