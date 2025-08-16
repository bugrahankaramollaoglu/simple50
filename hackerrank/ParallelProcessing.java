import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParallelProcessing {

	public static int sumOfList(List<Integer> arr) {
		int total = 0;
		for (int i = 0; i < arr.size(); i++) {
			total += arr.get(i);
		}
		return total;
	}

	public static int parallelProcessing(List<Integer> files, int numCores, int limit) {
		int grandTotal = 0;

		if (numCores == 1) {
			return sumOfList(files);
		}

		List<Integer> files2 = new ArrayList<>(files);
		files2.sort(Collections.reverseOrder());

		for (int nb : files2) {
			if (limit > 0 && nb % numCores == 0) {
				grandTotal += nb / numCores;
				limit--;
			} else {
				grandTotal += nb;
			}
		}

		return grandTotal;
	}

	public static void main(String[] args) {
		List<Integer> arr = List.of(4, 1, 3, 2, 8);
		System.out.println(parallelProcessing(arr, 5, 5));
	}
}
