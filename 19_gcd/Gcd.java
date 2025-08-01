public class Gcd {
    public static int gcd(int a, int b) {

        if (b == 0) return a;
        return gcd(b, a % b);

    }

    public static int gcd2(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(48, 18));
        System.out.println(gcd2(48, 18));
    }
}