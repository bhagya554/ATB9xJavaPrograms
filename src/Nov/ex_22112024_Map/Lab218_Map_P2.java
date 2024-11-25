package Nov.ex_22112024_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab218_Map_P2 {
    public static void main(String[] args) {


        Map m1 = new HashMap();//generics

        /*
        Map<String,Object> m1 = new HashMap<String,Object>();
        Map<String,Object> m1 = new HashMap();
        Map<String,Object> m1 = new HashMap();
         */

        m1.put("name","bhagya");
        m1.put("rollNo",123);
        m1.put("phone",986655667);
        System.out.println(m1);


    }
}
