import java.util.*;

public class leetcode20 {
    public static void main(String[] args) {
        int a[] = { 2,3,5};
    //    int t = 8;

        List<Integer> l1 = new ArrayList<>();
        List<List<Integer>> l2 = new ArrayList<>();
        gen( a,  l1, l2);
        System.out.println(l2);
    }

    public static void gen( int a[],  List<Integer> l1, List<List<Integer>> l2)
    {

       // l2.add(new ArrayList<>(l1));
        for (int i=0; i < a.length; i++) {
          //  l1.add(a[i]);
            gen( a, l1, l2);
            gen(a,l1,l2);

        }
        return;
    }
}
