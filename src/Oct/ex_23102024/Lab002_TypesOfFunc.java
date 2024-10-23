package Oct.ex_23102024;

public class Lab002_TypesOfFunc {
    public static void main(String[] args) {
    greet();
    String returnedValue=greet_with_Hello();
    System.out.println(returnedValue);
    greet_with_your_name("bhagya");
    System.out.println("Full Name is : " +greet_with_fullname("bhagya", "kuupudi"));

    }

    //1.Without Parameter Without Return type
    static void greet(){
        System.out.println("Hello How are you!!");
    }

    // 2. Without parameter and With return type
    static String greet_with_Hello(){
        System.out.println("Hello How are you: ");
        return "You are awesome";
    }
    // 3. With parameter and Without return type
    static void greet_with_your_name(String name){
        System.out.println("Hello How are you: " + name);
    }

    //With parameter and With return type
    static String greet_with_fullname(String firstName,String lastName){
        return firstName+" " + lastName;
    }

}
