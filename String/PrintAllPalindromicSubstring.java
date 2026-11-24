package String;

public class PrintAllPalindromicSubstring {
    

    public static void main(String[] args) {
    
    String s=IO.readln();
    subString(s);
    }

    public static  void subString(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            printAllSubString(s,i,i);
            printAllSubString(s,i,i+1);
        }
    }
    public static void printAllSubString(String s,int start,int end)
    {
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end))
        {
            System.out.println(s.substring(start, end+1));
            start--;
            end++;
        }
    }
}
