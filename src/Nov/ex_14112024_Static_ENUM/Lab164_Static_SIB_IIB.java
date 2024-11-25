package Nov.ex_14112024_Static_ENUM;

public class Lab164_Static_SIB_IIB {
    public static void main(String[] args) {
        A a1;//both SIB and IIB will not execute if only reference is created
      /*
      O/p:
      <<No Output>>
      Process finished with exit code 0
       */
        //SIB is executed only once and IIB is executed for all object creations
        A a2 = new A();
        A a3 = new A();
        /*
             O/p:
                 SIB
                 IIB
                 IIB
       */
        new A();
         /*
             O/p:
                 SIB
                 IIB

          */
    }
}

class A{
    {
        System.out.println("IIB");
    }

    static {
        System.out.println("SIB");
    }
}
