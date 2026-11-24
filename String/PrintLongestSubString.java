package String;

public class PrintLongestSubString {


    public static void main(String[] args) {
        longestPalindrome("abbcbbabc");
    }
    
   public  static int longestPalindrome(String s) {
        int maxLength=0;

        for(int i=0;i<s.length();i++)
        {
            int l1=expandCentre(s,i,i);
                        int l2=expandCentre(s,i,i+1);
            int max=Math.max(l1,l2);
                        if(max>maxLength)
                        {
                            maxLength=max;
                        }
        }
        return maxLength;

        
    }

     public static  int expandCentre(String s,int s1,int e)
    {
        while(s1>=0 && e<s.length() && s.charAt(s1)==s.charAt(e))
        {
            s1-=1;
            e+=1;
        }
        return e-s1-1;
    }
}
