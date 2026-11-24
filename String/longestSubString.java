package String;

public class longestSubString {

    public static void main(String[] args) {
        
String ans=        longestPalindrome("abbabbaabcba");
System.out.println(ans);
    }
    
     public static String longestPalindrome(String s) {
         if (s == null || s.length() < 1) return "";
         int start=0;
         int end=0;
        

        for(int i=0;i<s.length();i++)
        {
            int l1=expandCentre(s,i,i);
                        int l2=expandCentre(s,i,i+1);
            int max=Math.max(l1,l2);
                        if(max>end-start+1)
                        {
            start = i - (max - 1) / 2;
            end = i + max / 2;
                        }
        }
        return s.substring(start,end+1);

        
    }
    public static  int expandCentre(String s,int s1,int e)
    {
        while(s1>=0 && e<s.length() && s.charAt(s1)==s.charAt(e))
        {
            s1--;
            e++;
        }
        return e-s1-1;
    }

}


   