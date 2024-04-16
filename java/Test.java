class Test
{
  public static void main(String[] args) {
    int arr[]={2,3,4,7,5,3,8,54};
    int t=54;
    System.out.println(fac(arr,0,t));

    }
    public static int fac(int []arr,int idx,int t)
    {
      if(idx==arr.length)
      return -1;
     
    if(arr[idx]==t){
      return idx;
    }
    return fac(arr,idx+1,t);
  }
}