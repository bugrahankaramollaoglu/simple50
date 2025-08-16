import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActiveTraders {

	public static List<String> activeTraders(List<String> customers) {

		Map<String, Integer> traderMap = new HashMap<String, Integer>();

		for (String trader : customers) {
			traderMap.put(trader, traderMap.getOrDefault(trader, 0) + 1);
		}

		List<String> finalList = new ArrayList<>();

		traderMap.forEach((key, value) -> {
			if (value > customers.size() * 0.05) {
				finalList.add(key);
			}
		});

		Collections.sort(finalList);

		return finalList;
	}

	public static void main(String[] args) {

		List<String> customers0 = Arrays.asList(
				"Alpha", "Beta", "Zeta", "Beta",
				"Zeta", "Zeta", "Epsilon", "Beta",
				"Zeta", "Beta", "Zeta", "Beta",
				"Zeta", "Delta", "Zeta", "Beta",
				"Zeta", "Beta", "Zeta", "Beta",
				"Zeta", "Beta");
		System.out.println("Test Case 0:");
		System.out.println("Expected Output: [Beta, Zeta]");
		System.out.println(activeTraders(customers0));

		// Test Case 1
		List<String> customers1 = Arrays.asList(
				"Alpha", "Beta", "Zeta", "Zeta", "Beta",
				"Zeta", "Zeta", "Epsilon", "Beta", "Zeta",
				"Beta", "Zeta", "Beta", "Delta", "Zeta",
				"Beta", "Zeta", "Beta", "Zeta", "Beta", "Zeta");
		System.out.println("Test Case 1:");
		System.out.println("Expected Output: [Beta, Zeta]");
		System.out.println(activeTraders(customers1));

		// Custom Test Case 2
		List<String> customers2 = Arrays.asList(
				"Bigcorp", "Bigcorp", "Acme", "Bigcorp", "Zork",
				"Zork", "Abc", "Bigcorp", "Acme", "Bigcorp",
				"Bigcorp", "Zork", "Bigcorp", "Zork", "Zork",
				"Bigcorp", "Acme", "Bigcorp", "Acme", "Littlecorp",
				"Nadircorp");
		System.out.println("Test Case 2:");
		System.out.println("Expected Output: [Acme, Bigcorp, Zork]");
		System.out.println(activeTraders(customers2));

	}
}
