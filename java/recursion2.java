import java.util.*;

public class recursion2 {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        String ans = "abca";
        int k = 0;
        String ans1 = "";
        permu(ans, ans1, l1);
    }

    public static void permu(String ans, String ans1, List<String> l1) {

        // List<String> l2 = new ArrayList<String>();

        if (ans1.length() == 3) {

            if (!l1.contains(ans1)) {

                l1.add(ans1);
                System.out.println(ans1);
            }

            return;
        }

        for (int i = 0; i < ans.length(); i++) {
            permu(ans.substring(0, i) + ans.substring(i + 1), ans1 + ans.charAt(i), l1);

        }

    }

}
