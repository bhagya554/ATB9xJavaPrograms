package Nov.ex_15112024_Wrapper_Exceptions;

public class Lab174_Exception {
    public static void main(String[] args) {
        System.out.println("Start of program");
        int b=0;

            String ip=args[0];//Array index out of bound
            int a=Integer.parseInt(ip);//Number format
            b=1000/a;//Arithmetc  / by zero




        System.out.println(b);
        System.out.println("End of program");

    }
}
