package Oct.ex_29102024;

import java.util.Arrays;

public class Lab002_ArraysSortBinarySearch {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0]=56;
        a[1]=12;
        a[2]=3;
        a[3]=55;
        a[4]=23;

        Arrays.sort(a);//6,12,23,56,66
        int searchValueIndex=Arrays.binarySearch(a,66);
        System.out.println("Index of searched value is: " +searchValueIndex);
        System.out.println("Min value is: " +a[0]);
        System.out.println("Max Value is: " + a[a.length-1]);
    }
}
