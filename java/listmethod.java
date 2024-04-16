import java.util.*;
public class listmethod {
    public static void main(String[] args) {
        int n=6;
        int m=7;
        

        System.out.println(number(n,m));
    }
    public static  List<Integer> number(int n,int m)
    {
        Scanner sc=new Scanner(System.in);
        List<Integer> l1=new ArrayList<Integer>();
        int a[]=new int[n];
        int b[]=new int [m];
        for(int i=0;i<n;i++){
            System.out.print("enter the value at "+i);
            int a1=sc.nextInt();
            a[i]=a1;

        }
        for(int j=0;j<m;j++)
        {
            System.out.println("enter the value at"+j);
            int b1=sc.nextInt();
            b[j]=b1;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i]==b[j])
                l1.add(a[i]);

            }
        }

        return l1;
    }
    
}
