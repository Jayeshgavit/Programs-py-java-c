// Check if a String is a Palindrome

package DSA.prb_5;

public class strPalindrome {
    
    public static String isPalindrome(String str){

        String rev = "";
        for(int i = 0; i < str.length(); i++){
            rev = str.charAt(i) + rev;
        }


        if(str.equals(rev)){
            return "Is Palindrome"; 
        }else{
            return "Is not Palindrome";       }
    }

    public static void main(String[] args) {
        String str= "madam";
        String result = isPalindrome(str);
        System.out.println(result);
    }
}
