import java.util.*;
public class practice {
    public static void main(String[] args) {
      int a=5;
      int b=1;
      gen(a);
      gen1(a,b);
}
public static void gen(int a)
{
  if(a==0)
  return;
  if(a%2!=0)
  System.out.println(a);
  gen(a-1);
  return;
}
public static void gen1(int a,int b)
{
  if(a==b)
  return;
  if(b%2==0)
  System.out.println(b);
  gen1(a,b+1);
  return;
}
}