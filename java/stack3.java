import java.util.*;
public class stack3 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        System.out.println(st1);
        st2.push(st1.pop());
        st2.push(st1.pop());
        st2.push(st1.pop());
        st1.push(1000);
        st1.push(st2.pop());
        st1.push(st2.pop());
        st1.push(st2.pop());
        System.out.println(st1);

    }

}
