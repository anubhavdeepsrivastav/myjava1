import java.util.*;
import java.util.*;
public class backtracksubset {
    public static void main(String[] args) {
        int[] x={2,3,5};
        ArrayList<Integer> m =new ArrayList<Integer>();//to print element in list
        ArrayList<ArrayList<Integer>> ansn=new ArrayList<ArrayList<Integer>>();
        coin_code(0,8,0,x,"",m,ansn);
        System.out.println(ansn);
    }
    public static void coin_code(int k,int n,int sum,int[] arr,String s,ArrayList<Integer> m,ArrayList<ArrayList<Integer>> ansn){
        if(sum==n){
          //  System.out.println(m);
            ansn.add(new ArrayList<>(m));
//            m.remove(m.size()-1);
            return;
        }
        if(sum>n){
            return;
        }
        for (int i=k;i<arr.length;i++){
            m.add(arr[i]);
            coin_code(i,n,sum+arr[i],arr,s+arr[i],m,ansn);
            m.remove(m.size()-1); //backtracking
     }
   }
}