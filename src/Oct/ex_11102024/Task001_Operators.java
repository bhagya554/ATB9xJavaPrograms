package Oct.ex_11102024;

public class Task001_Operators {
    public static void main(String[] args) {
        /*
        Unary: 1 operand
        Binary -  2 operands
        Terinary - 3 operands
         */

        //Assignment Operator: =
        int a = 50;
        System.out.println(a);

        //Arithmetic Operator: +,-,/,%,*
        int a1=40;
        int b1=20;
        System.out.println("Sum: " + (a1+b1));
        System.out.println("Sub: " + (a1-b1));
        System.out.println("Product: " + (a1*b1));
        System.out.println("Division: " + (a1/b1));
        System.out.println("Remainder: " + (a1%b1));

        int c1=10;
        //Logical Operators: && || !
        System.out.println("a1<b1 and a1<c1" + (a1<b1 && a1<c1));
        System.out.println("a1>b1 or a1>c1: " + (a1>b1 || a1>c1));
        System.out.println("Not a1<b1 " + !(a1<b1));


        //Relational Operators: <,>,<=,>=,==,!=
        System.out.println("a1<b1" + (a1<b1));
        System.out.println("a1>b1: " + (a1>b1));
        System.out.println("a1<=b1: " + (a1<=b1));
        System.out.println("a1>=b1: " + (a1>=b1));
        System.out.println("a1==b1: " + (a1==b1));
        System.out.println("a1!=b1: " + (a1!=b1));

        boolean b0 = true;
        System.out.println(!b0);//false
        System.out.println(!!b0);//true
        System.out.println(!!!b0);//false
        System.out.println(!!!!b0);//true

        //terinory
        String b = a1>b1?"a1 is the greatest":"b1 is the greatest";
        System.out.println(b);

        //Unary -- ++,--
        System.out.println("post increment a1=40: "+a1++);//40
        System.out.println(a1);//41
        System.out.println("Pre increment a1=41: "+(++a1));//42
        System.out.println(a1);//42

        System.out.println("post decrement a1=42: "+a1--);//42
        System.out.println(a1);//41
        System.out.println("Pre decrement a1=41: "+(--a1));//40
        System.out.println(a1);//40


    }
}
