import java.util.*;

public class fibonaccirecursion {
    public static void main(String[] args) {
        int a=-1;
        int b=0;
        int c=0;
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        gen(a,b,c,n);    
        }
        public static void gen(int a,int b,int c,int n)
        {
            if(n==0)
            return;
            c=a+b;
            System.out.println(c);
            gen(b,c,c,n-1);
        }
    

}

