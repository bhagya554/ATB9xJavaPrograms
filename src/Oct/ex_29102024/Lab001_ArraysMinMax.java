package Oct.ex_29102024;

import java.util.Scanner;

public class Lab001_ArraysMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=sc.nextInt();

        int[] a = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter value at index " + i);
            a[i]=sc.nextInt();
        }

        int minValue=minValue(a);
        System.out.printf("Min value in the array is %d",minValue);
        System.out.println();
        int maxValue=maxValue(a);
        System.out.printf("Max value in the array is %d",maxValue);
    }

    private static int minValue(int[] a) {
        int min = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }

    private static int maxValue(int[] a) {
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
}
