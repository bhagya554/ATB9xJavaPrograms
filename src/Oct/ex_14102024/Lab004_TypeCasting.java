package Oct.ex_14102024;

public class Lab004_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 723329808;
        //short s=phone_no;//Implicit - JVM - Not possible
        short s = (short) phone_no;//Explicit - User - data loss

        //GST - 18.45
        int course=100;
        float GST=18.45f;
        int total_price=course+(int)GST;//Narrowing - Explicit
        System.out.println(total_price);
    }
}
