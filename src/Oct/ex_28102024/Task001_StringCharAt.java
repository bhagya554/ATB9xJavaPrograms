package Oct.ex_28102024;

public class Task001_StringCharAt {
    public static void main(String[] args) {
        String s1 = "Hello my name is X";
        System.out.println(s1.charAt(10));//a

        String st1 = "    Abhay    ";
        System.out.println(st1.trim());//Abhay - removes start and end spaces

        String st2 = "Pramod dutta";
        System.out.println(st2.indexOf('m'));//3 - return first index of the given character
        System.out.println(st2.contains("d"));//true
        System.out.println(st2.lastIndexOf('a'));//11
        System.out.println(st2.replace('a','z'));//Przmod duttz
        System.out.println(st2.startsWith("P"));//true

        String st3 = "Hello123 World456 Bha789gya 7899BBHB";
        String afterReplace = st3.replaceAll("\\d","");
        System.out.println(afterReplace);



    }
}
