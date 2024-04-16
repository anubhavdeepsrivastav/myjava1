
import java.util.*;
public class checksum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean t=false;
        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)
            {
            t=true;
            break;
        }
        }
        if(t)
        System.out.println("no the number is prime");
        else
        System.out.println("yes a prime number is not ");

    }
    
}
