public class coinchange {
    public static void main(String[] args) {
        String ans = "";
        coinchanges(3, ans);
    }

    public static void coinchanges(int n, String ans) {
        if (n == 0) {
            if (!ans.contains("HH"))
                System.out.println(ans);
            return;
        }
        coinchanges(n - 1, ans + "H");
        coinchanges(n - 1, ans + "T");
    }

}
