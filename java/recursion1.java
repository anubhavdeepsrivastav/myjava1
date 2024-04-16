import java.util.*;
public class recursion1 {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<Integer>();
        List<List<Integer>> l2=new ArrayList<>();
        int  a[]={2,3,4,7};
        int b=7;
        int sum=0;
        number(a,b,sum);
    }
    public static void number(int a[],int b,int sum){
        if(sum==7)
        {
            l2.add(l1);
            
        }
        
    }
    
}
