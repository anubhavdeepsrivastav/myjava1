public class p1 {
    public static void main(String[] args) {
        int a = 5;
        gen(a);

    }

    public static void gen(int a) {
        if (a == 0)
            return;
        if (a % 2 != 0)
            System.out.println(a);
        gen(a - 1);
        if (a % 2 == 0)
            System.out.println(a);
        return;
    }

}
