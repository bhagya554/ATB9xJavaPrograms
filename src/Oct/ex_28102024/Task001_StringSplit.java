package Oct.ex_28102024;

public class Task001_StringSplit {
    public static void main(String[] args) {
        String fruits = "Apple,Banana,Cherry";
        //pipe(|) does not work in split as its related to Regex(to extract specific value from string)
        String[] allFruits=fruits.split(",");
        System.out.println(allFruits[0]);
        System.out.println(allFruits[1]);
        System.out.println(allFruits[2]);
    }
}
