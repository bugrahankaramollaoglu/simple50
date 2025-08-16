public class SumOfDigits {
    public static int sumOfDigits(int nb) {

        if (nb == 0) return 0;

        if (nb < 0) {
            nb = -nb;
        }

        int digitTotal = 0;
        while (nb > 0) {
            digitTotal += nb % 10;
            nb /= 10;
        }
        return digitTotal;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1237));
    }
}