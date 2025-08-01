public class PrintList {
    public static void printList(int[] arr) {
        for (int nb : arr) {
            System.out.print(nb+ " ");
        }
    }
    public static void main(String[] args) {
        printList(new int[]{10,20,30,40,50});
    }
}