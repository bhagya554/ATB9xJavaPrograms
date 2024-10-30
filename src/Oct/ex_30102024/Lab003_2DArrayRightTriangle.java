package Oct.ex_30102024;

import java.util.Scanner;

public class Lab003_2DArrayRightTriangle {
    public static void main(String[] args) {
        /*

        *
        * *
        * * *
        * * * *
        * * * * *
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=sc.nextInt();
        for(int row=0;row<n;row++){//0
            for(int col=0;col<=row;col++){//0
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
