package Nov.ex_14112024_Static_ENUM;

public class Lab170_ENUM {
    public static void main(String[] args) {
        System.out.println(Color.RED.getHexCode());

    }
}

enum Color{

    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW ("#4477FF");

    private String hexCode;

    Color(String hexCode){
        this.hexCode=hexCode;
    }

    public String getHexCode(){
        return hexCode;
    }

}
