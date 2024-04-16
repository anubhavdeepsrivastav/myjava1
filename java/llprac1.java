public class llprac1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++)
        {
        Node y=new Node(arr[i]);
        }
    for()
        System.out.println(y.data);

    }
}
 class Node{
int data;
Node next;
Node(int data1,Node next1){
this.data=data1;
this.next=next1;
}
Node(int data1)
{
    this.data=data1;
    this.next=null;
}

}
