public class AverageArray {

    public static float averageArray (int[] arr){

        int total = 0;
        for (int nb : arr) {
            total += nb;
        }
        return total / arr.length;
    }
    public static void main(String[] args) {
        System.out.println(averageArray(new int[]{10,20,30}));
    }
}