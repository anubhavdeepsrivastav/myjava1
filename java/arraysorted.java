import java.util.*;
public class arraysorted {
    public static void main(String[] args) {

        int [] arr={10,20,40,30};
        System.out.println(sorted(arr,0));
    }
    public static boolean sorted(int [] a,int idx)
    {
        if(idx==a.length-1)
        return true;
        if(a[idx]>a[idx+1]){
            return false;
        }
        boolean x=sorted(a,idx+1);
        if(x==true)
        return true;
        else 
        return false;
    }
}
