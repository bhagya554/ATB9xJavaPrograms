package Oct.ex_16102024;

public class Lab010_UsingArgument {
    public static void main(String[] age) {
       int age_value=Integer.parseInt(age[0]);
       String age_valid = age_value>18?"Allowed to vote":"Not Allowed to vote";
       System.out.println(age_valid);
    }
}
