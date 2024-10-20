package Oct.ex_09102024;

public class Task001_Task002_Table10_finalKeyword {
    public static void main(String[] args) {
        int a=4;
        final String schoolName="ATB9x";

        for(int i=1;i<=10;i++) {
            System.out.printf("%d X %d = %d\n", a, i, a * i);
        }
        System.out.printf("School name is %s",schoolName);
    }
}
