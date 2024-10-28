package Oct.ex_28102024;

public class Task001_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        //StringBuilder and StringBuffer - both mutable
        //StringBuffer - Thread safe - slow and does sequencially
        //StringBuilder - Not Thread Safe - parellel

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        StringBuilder sbb = new StringBuilder("Pramod");
        sbb.append("sharma");
        System.out.println(sbb);
    }
}
