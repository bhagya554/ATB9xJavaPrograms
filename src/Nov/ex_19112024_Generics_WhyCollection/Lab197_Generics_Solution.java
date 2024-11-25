package Nov.ex_19112024_Generics_WhyCollection;

public class Lab197_Generics_Solution {
    public static void main(String[] args) {
        generic_sum(12,34);
        generic_sum("bhagya","Kudupudi");
        generic_sum(true,false);
    }

    public static <T> T generic_sum(T a,T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
