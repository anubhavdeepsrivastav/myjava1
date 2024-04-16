
public class backtrack {
    public static void main(String[] args) {
        int n=2;
        boolean seat[]=new boolean[4];
        seating(n,seat,0,"");
    }    
    public static void seating(int n,boolean seat[],int curr,String ans)
    {
        if(curr==n){
        System.out.println(ans);
        return;
        }
        for(int i=0;i<seat.length;i++)
        {
            if(seat[i]==false){
            seat[i]=true;
            seating(n,seat,curr+1,ans+"s"+(i+1)+"p"+(curr+1));
            seat[i]=false;
            }
        }
    }
}
