import java.util.*;

public class subsequence {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3 };
        List<Integer> l1 = new ArrayList<>();
        List<List<Integer>> l2 = new ArrayList<>();
        int idx = 0;
        gen(idx, l1, a, l2);
       Collections.sort(l2);
        System.out.println(l2);
    }

    public static void gen(int idx, List<Integer> l1, int a[], List<List<Integer>> l2) {
        if (idx == a.length) {
            l2.add(new ArrayList(l1));
            return;
        }
        l1.add(a[idx]);
        gen(idx + 1, l1, a, l2);
        l1.remove(l1.size() - 1);
        gen(idx + 1, l1, a, l2);

    }
}
