public class stack2 {
   static  int idx=-1;
    public static void main(String[] args)
    {
      
        stack st=new stack();
        st.push(10);
        st.push(12);
        st.push(123);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        st.print();
        System.out.println(st.size());
        System.out.println(st.pop());
        st.print();
        System.out.println(st.size());
    }
   

    
}
class stack{
    private int arr[];
    private int idx=-1;
    stack(){
        arr=new int[10];
    }
    stack(int n)
    {
        arr=new int [n];
    }
    public void push(int element)
    {
        idx++;
        arr[idx]=element;
    }
    public int peek()
    {
        return arr[idx];
    }
    public boolean isEmpty()
    {
        if(idx==-1)
        return true;
        else
        return false;
    }
    public void print()
    {
        for(int i=0;i<=idx;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
    public int pop()
    {
        int x=arr[idx];
        idx--;
        return x;
    }
    public int size()
    {
        return idx+1;
    }
}
