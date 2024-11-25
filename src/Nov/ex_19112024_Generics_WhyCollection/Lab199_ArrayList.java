package Nov.ex_19112024_Generics_WhyCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
//Dynamic size
//allows duplicates
//allows diff data type values
public class Lab199_ArrayList {
    public static void main(String[] args) {
        List studentList = new ArrayList();
        studentList.add("bhagya");
        studentList.add("bhagya");
        studentList.add("Anil");
        studentList.add(null);
        studentList.add(true);
        studentList.add(123);

    }
}
