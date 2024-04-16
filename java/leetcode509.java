import java.util.*;
public class leetcode509 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        System.out.println(gen(a));
    }
    public static int gen(int n)
    {
        if(n==0||n==1)
        return n;
        return gen(n-1)+gen(n-2);
    }
    
}
