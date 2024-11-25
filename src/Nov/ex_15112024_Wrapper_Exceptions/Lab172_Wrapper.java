package Nov.ex_15112024_Wrapper_Exceptions;

public class Lab172_Wrapper {
    public static void main(String[] args) {
       int a=10;
       Integer a1=a;//boxing - int >> Integer
        System.out.println(a + " " + a1);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(a1.intValue());

        Integer a2=42;
        int value=a2;
        System.out.println(value);
    }
}
