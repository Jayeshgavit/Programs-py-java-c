package DSA.prb_4;

public class substr_present_rnot {

    public static String subStrPresent(String mainstr, String substr) {
        
        if(mainstr.contains(substr)){
            return "Substring Found";
        }else{
            return "Not Found";
        }
    }
    public static void main(String[] args) {
        
        String mainstr = "Welcome to js Tutorial";
        String substr = "js";

        String rs = subStrPresent(mainstr,substr);
        System.out.println(rs);
    }
}
