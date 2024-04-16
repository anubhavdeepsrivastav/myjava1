public class matrixmethod {
    public static void main(String[] args) {
        int n=3;
        int m=3;
        String ans="";
        plate(0,0,n-1,m-1,ans);
    }
    public static void plate(int sx,int sy,int ex,int ey,String ans)
    {
        if(sx==ex&&sy==ey){
            System.out.println(ans);
            return;
        }
        
        if(sx>ex||sy>ey)
        return;
        plate(sx+1, sy, ex, ey, ans+"V");
        plate(sx,sy+1,ex,ey,ans+"H");
    }
    
}
