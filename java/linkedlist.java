import java.util.*;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        next = null;
    }
}

public class linkedlist {
    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node k = new node(1000);
        node mn=new node(1111111111);
        k.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next=mn;
        node temp = k;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}