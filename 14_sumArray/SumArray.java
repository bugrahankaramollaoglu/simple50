public class SumArray {

    public static int sumArray(int[] arr){
        int total = 0;
        for (int nb : arr) {
            total += nb;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sumArray(new int[] {10,20,30,4}));
    }
}