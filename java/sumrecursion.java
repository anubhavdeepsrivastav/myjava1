public class sumrecursion {
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
        dice(sp+1,ep,ans+"1");
        dice(sp+2,ep,ans+"2");
        dice(sp+3,ep,ans+"3");
    }
}
