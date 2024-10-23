package Oct.ex_16102024;

public class Lab009_UsingArgument {
    public static void main(String[] args) {
        System.out.printf(args[0] +" " +args[1] +" " + "Your age is : %d",Integer.parseInt(args[2]));
        System.out.println();
        System.out.println(args[0] + " " + args[1] + " "+ "Your age is : " + Integer.parseInt(args[2]));
    }
}
