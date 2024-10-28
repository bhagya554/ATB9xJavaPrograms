package Oct.ex_28102024;

public class Lab001_StringFunctions {
    public static void main(String[] args) {
        String str1 = "Hello My Dear Selenium";
        System.out.println(str1.charAt(6));//M
        System.out.println(str1.concat(" with Java"));//Hello My Dear Selenium with Java
        System.out.println(str1.replace('e', 'Z'));//HZllo My DZar SZlZnium
        System.out.println(str1.indexOf('o'));//4
        System.out.println(str1.lastIndexOf('e'));//17
        System.out.println(str1.substring(2,7));//lo My
        System.out.println(str1.startsWith("Hello"));//true
        System.out.println(str1.endsWith("nium"));//true
        System.out.println(str1.contains("Dear"));//true

        String str2 = "   hellooo223 34Java 8989bye   ";
        System.out.println(str2.trim());//hellooo223 34Java 8989bye
        System.out.println(str2.trim().replaceAll("\\d",""));//hellooo Java bye

    }
}
