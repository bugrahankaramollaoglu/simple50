import java.util.Arrays;

/*  array rotatelemenin mantıgı şöyle
mesela [1,2,3,4,5] elemanını n adım ötelemek istiyoruz. 3 adımda yapıyoruz:

    1) bütün listeyi ters çevir
    [5,4,3,2,1]

    2) ilk n elemanı ters çevir (mesela n=3)
    [3,4,5,2,1]

    3) kalanları ters çevir
    [3,4,5,1,2]

*/

public class rotateArray {

    private static void tersCevir(int[] arr, int left, int right) {
        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }

    private static void otele(int[] arr, int n) {
        tersCevir(arr, 0, arr.length - 1); // birinci adim
        tersCevir(arr, 0, n - 1); // ikinci adim
        tersCevir(arr, n, arr.length - 1); // üçüncü adim
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        otele(arr1, 3);
        System.out.println(Arrays.toString(arr1)); // [4, 5, 1, 2, 3]
    }
}