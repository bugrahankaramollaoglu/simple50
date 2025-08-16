import java.util.ArrayList;
import java.util.List;

public class MaximumLaptopCost {

	public static int maxLaptopCost(List<Integer> costs, List<String> labels, int dailyCount) {
		int maxTotal = 0;

		for (int start = 0; start < costs.size(); start++) {
			int total = 0;
			int daily2 = 0;
			
			for (int i = start; i < costs.size(); i++) {
				if (labels.get(i).equals("legal")) {
					daily2++;
				}
				total += costs.get(i);

				if (daily2 == dailyCount) {
					maxTotal = Math.max(maxTotal, total);
					break;
				}
			}
		}

		return maxTotal;
	}

	public static void main(String[] args) {
		// Helper for testing
		java.util.function.BiConsumer<Integer, Integer> assertTest = (result, expected) -> {
			System.out.println("Result: " + result + " | Expected: " + expected +
					(result.equals(expected) ? " ✅" : " ❌"));
		};

		// Test 1: Single day
		assertTest.accept(
				maxLaptopCost(
						java.util.Arrays.asList(0, 3, 2, 3, 4),
						java.util.Arrays.asList("legal", "legal", "illegal", "legal", "legal"),
						1),
				5);

		// Test 2: Multiple days
		assertTest.accept(
				maxLaptopCost(
						java.util.Arrays.asList(0, 3, 2, 3, 4, 1, 5, 2, 4, 1),
						java.util.Arrays.asList("illegal", "legal", "legal", "illegal", "illegal",
								"legal", "illegal", "legal", "legal", "illegal"),
						2),
				15);

		// Test 3: All illegal
		assertTest.accept(
				maxLaptopCost(
						java.util.Arrays.asList(5, 7, 8),
						java.util.Arrays.asList("illegal", "illegal", "illegal"),
						1),
				0);

		// Test 4: Exact daily count once
		assertTest.accept(
				maxLaptopCost(
						java.util.Arrays.asList(2, 3),
						java.util.Arrays.asList("legal", "legal"),
						2),
				5);

		// Test 5: Not enough legal in last day
		assertTest.accept(
				maxLaptopCost(
						java.util.Arrays.asList(3, 4, 5),
						java.util.Arrays.asList("legal", "illegal", "legal"),
						3),
				0);

		// Test 6: Large values
		assertTest.accept(
				maxLaptopCost(
						java.util.Arrays.asList(1000, 2000, 3000, 4000),
						java.util.Arrays.asList("legal", "legal", "legal", "legal"),
						2),
				7000);
	}

}
