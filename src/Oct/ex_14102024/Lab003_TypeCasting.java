package Oct.ex_14102024;

public class Lab003_TypeCasting {
    public static void main(String[] args) {
        /* 2 types of type casting
        1. Widening - Implicit and Explicit - lossless
        2. Narrowing - Implicit,Explicit(with datatype) - loss
         */

        //Widening - converting smaller data type to larger data type
        //Implicit - JVM as well Explicit are possible
        byte b1=10;
        int i1=b1;//implicit - done by JVM
        int i11=(int)b1;//explicit - JVM has already done it, user explicitly mentioned

        //Narrowing - converting larger data type to smaller datatype -
        // Implicit- Not possible and Explicit - possible
        int i2=200;
        //byte b2=i2;//Invalid - implicit - as per JVM
        byte b2=(byte)i2;//explicit- done by user
    }
}
