package String;

public class PalindromeType02 {
    

      public static void main(String[] args) {
        
        
        if(checkPalindrome("abcddcb"))
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

        int start , end;
        int length=s.length();
      
        if(s.length()%2==1)
        {
            start=length/2;
            end=length/2;
        }
        else
        {
             start=length-1;
            end=length;
        }
        while(start>=0 &&  end <length)
        {
            if(s.charAt(start)!= s.charAt(end))
            {
                return false;
            }
            start--;
            end++;
        }
        return true;

    }
}
