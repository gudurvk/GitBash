package Package.Trees.Vector1;

public class Palindrome {
       static boolean palindrome(String s,int start ,int end)
       {
           if(start>=end)
               return true;
        if( start<s.length()-1 && s.charAt(start)==s.charAt(end)) {
            //System.out.println("Not a Palindrome");
            //    else if(start<end&&s.charAt(start)==s.charAt(end))
            return palindrome(s.substring(start + 1, end - 1), start+1, end - 1);
            //    else
            //      System.out.println(" palindrome");
        }

return false;
       }

    public static void main(String[] args) {
           String s="abcba";
      //  System.out.println());
       System.out.println(palindrome(s,0, s.length()-1));
    }
}
