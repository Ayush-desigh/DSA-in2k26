package String;
import java.util.HashSet;
import java.util.Set;

public class PrintAllPalindromicSubStringWithOutRepeation {
    

      public static void main(String[] args) {
    
    String s=IO.readln();
     Set<String> set=new HashSet<>();
    subString(s,set);
    System.out.println(set);
    }

    public static  void subString(String s,Set<String> set)
    {
       
        for(int i=0;i<s.length();i++)
        {
            printAllSubString(s,i,i,set);
            printAllSubString(s,i,i+1,set);
        }
    }
    public static void printAllSubString(String s,int start,int end,Set<String> set)
    {
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end))
        {
           set.add(s.substring(start, end+1));
            start--;
            end++;
        }
    }
}
