package Oct.ex_15102024;
public class Lab005 {
    public static void main(String[] args) {
        int a=20;
        int b=100;
        int c=9;

        int result_largest=(a>b && a>c)?a:(b>c?b:c);
        System.out.println("largest of all 3 numbers is: " +result_largest);
    }
}
