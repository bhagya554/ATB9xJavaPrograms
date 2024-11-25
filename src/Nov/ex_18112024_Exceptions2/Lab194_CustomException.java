package Nov.ex_18112024_Exceptions2;

public class Lab194_CustomException {
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR",200);
        System.out.println(sbi.add(icici));

        Bank jp_morgan = new Bank("USD",300);
        System.out.println(sbi.add(jp_morgan));
    }

}
