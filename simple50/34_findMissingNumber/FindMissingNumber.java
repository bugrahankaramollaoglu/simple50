public class FindMissingNumber {

    public static int findMissingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }

    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{0,1,2,4}));
    }
}

// eğer garanti değilse arrayin sorted olacagı, sum metodunu kullanırsın. 1..n arası
// ideal toplamı bulup toplamdan cıkartarak eksik sayiyi bulup döndürebilirsin 