import java.util.*;
public class leetcode139 {
    public static void main(String[] args) {
        String s="ab";
        String ans="";
        List<String> l1=new ArrayList<>();
        gen(s,ans,l1);
        Collections.sort(l1);
        System.out.println(l1);
    }
    public static void gen(String s,String ans,List<String> l1)
    {
        if(s.length()==0){
        if(!l1.contains(ans))
        l1.add(ans);
        return;
        }
        gen(s.substring(1),ans+s.charAt(0),l1);
        gen(s.substring(1),ans,l1);

    }
    
}
