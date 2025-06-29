package DSA.prb_3;

public class reverse_String {
    
    public static String simpleReverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        String s = "hello";
        String rs = simpleReverse(s);
        System.out.println("Reversed String : "+ rs);
    }
}
