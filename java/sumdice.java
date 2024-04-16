public class sumdice {
    public static void main(String[] args) {
        int sp=0;
        int ep=4;
        String ans="";
        dice(sp,ep,ans);
    }
    public static void dice(int sp,int ep,String ans)
    {
        if(sp==ep)
        {
            System.out.println(ans);
            return;
        }
        if(sp>ep)
        return;
        for(int i=1;i<=3;i++)
        {
            dice(sp+i,ep,ans+i);
        }
    }
    
}
