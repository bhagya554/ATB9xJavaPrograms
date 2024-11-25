package Nov.ex_19112024_Generics_WhyCollection;

import java.util.ArrayList;

public class Lab200_ArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(3));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.indexOf(2));
        System.out.println(list.lastIndexOf(3));
    }
}
