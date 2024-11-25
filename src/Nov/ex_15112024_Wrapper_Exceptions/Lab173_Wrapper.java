package Nov.ex_15112024_Wrapper_Exceptions;

public class Lab173_Wrapper {
    public static void main(String[] args) {
      String num="10";
      //String -> Wrapper(Integer) ->Primitive
        Integer a1 = Integer.valueOf(num);
        int a2=a1;//unboxing

        //String -> Primitive
        int a3 = Integer.parseInt(num);

        Long l=10l;
        Short s = 23;
        Boolean bb = true;

    }
}
