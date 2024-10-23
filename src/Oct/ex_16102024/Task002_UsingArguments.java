package Oct.ex_16102024;

public class Task002_UsingArguments {
    public static void main(String[] args) {
        /*
        Task 2: Take a user input 2 numbers from the arguments
        and calculate the maximum in between with the ternary operator.
         */
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int max=a>b?a:b;
        System.out.println("Max value between : "+args[0]+ " and "+ args[1]+ " is: "+ max);
    }
}
