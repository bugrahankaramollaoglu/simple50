import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicatesArray {

	public static List<Integer> removeDuplicatesArray(List<Integer> arr) {

		Set<Integer> mySet = new HashSet<>();
		for (int val : arr) {
			mySet.add(val);
		}

		return new ArrayList<Integer>(mySet);

	}

	public static void main(String[] args) {

		List<Integer> myList = List.of(10, 20, 30, 30, 20, 40);
		System.out.println(removeDuplicatesArray(myList));
	}
}
