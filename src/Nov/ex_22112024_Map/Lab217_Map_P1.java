package Nov.ex_22112024_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab217_Map_P1 {
    public static void main(String[] args) {
        //Map is Key - value pair
        //name:bhagya

        Map m1 = new HashMap();//generics
        /*
        Map<String,Object> m1 = new HashMap();//Data type-fix
         */
        m1.put("name","bhagya");
        m1.put("rollNo",123);
        m1.put("phone",986655667);
        System.out.println(m1);


    }
}
