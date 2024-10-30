package Oct.ex_30102024;

import java.util.Scanner;

public class Lab003_2DArrayLeftTriangle {
    public static void main(String[] args) {
        /*

        * * * * *
        * * * *
        * * *
        * *
        *

        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=sc.nextInt();//5
        for(int row=0;row<n;row++){//1
            int x=n-row;//5
            for(int col=x;col>0;col--){//5 4 3 2 1
                System.out.print("* ");

            }

            System.out.println();
        }

    }
}
