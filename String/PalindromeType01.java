package String;

public class PalindromeType01 {

    public static void main(String[] args) {
        
        
        if(checkPalindrome("AB"))
        {
                System.out.println("it is Palindrome");
        }
        else
        {
                System.out.println("it is not Palindrome");
        }
    }

    public static boolean checkPalindrome(String s)
    {

        int start=0;
        int end=s.length()-1;
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
                return false;


            start++;
            end--;
        }

        return true;
    }
    
}
