import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringAnagram {

	public static boolean isAnagram(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;

		Map<Character, Integer> mapS1 = new HashMap<Character, Integer>();
		Map<Character, Integer> mapS2 = new HashMap<Character, Integer>();

		for (char ch : s1.toCharArray()) {
			mapS1.put(ch, mapS1.getOrDefault(ch, 0) + 1);
		}

		for (char ch : s2.toCharArray()) {
			mapS2.put(ch, mapS2.getOrDefault(ch, 0) + 1);
		}

		return mapS1.equals(mapS2);
	}

	public static List<Integer> stringAnagram(List<String> query, List<String> dictionary) {

		ArrayList<Integer> returnArr = new ArrayList<>(query.size());

		int num = 0;

		for (int i = 0; i < query.size(); i++) {
			for (int j = 0; j < dictionary.size(); j++) {
				if (isAnagram(query.get(i), dictionary.get(j))) {
					num++;
				}
			}
			returnArr.add(num);
			num = 0;
		}

		return returnArr;
	}

	public static void main(String[] args) {
		// Simple assertion helper
		java.util.function.BiConsumer<List<Integer>, List<Integer>> assertTest = (result, expected) -> {
			System.out.println("Result: " + result + " | Expected: " + expected +
					(result.equals(expected) ? " ✅" : " ❌"));
		};

		// Test 1: Example from your message
		assertTest.accept(
				stringAnagram(
						List.of("a", "nar", "cb"),
						List.of("rac", "aran", "ran", "bc", "cb", "cb", "cbe", "a", "arn")),
				List.of(1, 2, 3));

		// Test 2: No matches at all
		assertTest.accept(
				stringAnagram(
						List.of("xyz", "mnop"),
						List.of("abc", "def", "ghi")),
				List.of(0, 0));

		// Test 3: All queries match multiple times
		assertTest.accept(
				stringAnagram(
						List.of("abc", "bca"),
						List.of("cba", "abc", "bac", "cab")),
				List.of(4, 4));

		// Test 4: Dictionary has duplicates
		assertTest.accept(
				stringAnagram(
						List.of("ab"),
						List.of("ba", "ab", "ab", "aa")),
				List.of(3));

		// Test 5: Empty dictionary
		assertTest.accept(
				stringAnagram(
						List.of("a", "b"),
						List.of()),
				List.of(0, 0));
	}

}
