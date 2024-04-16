/*public class replace {
    public static void main(String[] args) {
        String ans="";
        int a=2;
        int b=a;
        gen(ans,0,0,a,b);
    }
    public static void gen(String ans,int he,int ve,int a ,int b)
    {
        if(he==ve)
        {
            System.out.print(ans);
            return;
        }
        if(ve>he)
        return;
       
        gen(ans+"(",he+1,ve,a,b);
        if(ve<he)
        gen(ans+")",he,ve+1,a,b);
    }
}
*/
import java.util.*;
public class replace {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String>list=new ArrayList<>();
        fun(n,0,0,list,"");
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
    }
    public static void fun(int n,int sb,int eb,List<String>list,String s){
        if(sb==n && eb==n){
            list.add(s);
            return;
        }
        if(sb>n||eb>n){
            return;
        }
        fun(n,sb+1,eb,list,s+"(");
        if(sb>eb){
            fun(n,sb,eb+1,list,s+")");
      }
   }
}