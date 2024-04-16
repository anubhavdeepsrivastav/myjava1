public class linked_lis{
	node head;
	node tail;
	int size;
	class node{
		int data;
		node next;
		node(int data){
			this.data=data;
			next=null;
		}
	}
	public void add_at_first(int val) {
		node n=new node(val);
		if(size==0) {
			head=n;
			tail=n;
			size++;
		}else {
			n.next=head;
			head=n;
			size++;
		}
	}
	public void print() {
		node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	}
	public void add_at_last(int val)
	{
		node k=new node(val);
		if(size==0)
		{
			head=k;
			tail=k;
			size++;
		}
		else{
			tail.next=k;
			tail=k;
			size++;
		}
	

	}
	public static void main(String[] args) {
		linked_lis l1=new linked_lis();
		l1.add_at_first(10);
		l1.add_at_first(20);
		l1.print();
		l1.add_at_first(30);
		l1.print();
		l1.add_at_last(100);
		l1.print();

		
	}


}