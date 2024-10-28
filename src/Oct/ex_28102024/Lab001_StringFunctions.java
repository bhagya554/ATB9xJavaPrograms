package Oct.ex_28102024;

public class Lab001_StringFunctions {
    public static void main(String[] args) {
        String str1 = "Hello My Dear Selenium";
        String str3 = "Hello my dear SelEnium";
        System.out.println(str1.charAt(6));//M
        System.out.println(str1.concat(" with Java"));//Hello My Dear Selenium with Java
        System.out.println(str1.replace('e', 'Z'));//HZllo My DZar SZlZnium
        System.out.println(str1.indexOf('o'));//4
        System.out.println(str1.lastIndexOf('e'));//17
        System.out.println(str1.substring(2,7));//lo My
        System.out.println(str1.startsWith("Hello"));//true
        System.out.println(str1.endsWith("nium"));//true
        System.out.println(str1.contains("Dear"));//true
        System.out.println(str1.length());//22
        System.out.println(str1.toLowerCase());//hello my dear selenium
        System.out.println(str1.toUpperCase());//HELLO MY DEAR SELENIUM
        System.out.println(str1.equals(str3));//false
        System.out.println(str1.equalsIgnoreCase(str3));//true
        String[] splitAfter=str1.split(" ");
        for(int i=0;i<splitAfter.length;i++){
            System.out.println(splitAfter[i]);
        }

        String str2 = "   hellooo223 34Java 8989bye   ";
        System.out.println(str2.trim());//hellooo223 34Java 8989bye
        System.out.println(str2.trim().replaceAll("\\d",""));//hellooo Java bye

    }
}
