package Nov.ex_18112024_Exceptions2;

public class Lab189_TryCatch {
    public static void main(String[] args) {
        try {
            String s1 = "bhagya";
            String a1=args[0];
            int a=10/0;
            s1=null;
            System.out.println(s1.trim());
        }

        catch (Exception e){
            System.out.println("There is some problem");
            System.out.println(e.getMessage());
        }

        System.out.println("End of Program");
    }
}