public class coinchange2 {
    static int count=0;
    public static void main(String[] args) {
        String ans="";
        coinchanges(3,ans);
        System.out.println(count);
    }
    public static void coinchanges(int n,String ans){
    if(n==0)
    {
        count++;
        System.out.println(ans);
        return;
    }
    coinchanges(n-1,ans+"H");
    coinchanges(n-1,ans+"T");
    }
    
}
