import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

class Result {

	public static List<Long> findSum(List<Integer> numbers, List<List<Integer>> queries) {
		int n = numbers.size();

		// Use a prefix sum array to store cumulative sums of numbers.
		// The size is n+1 to handle the base case for index 0.
		long[] prefixSums = new long[n + 1];

		// Use a prefix count array to store cumulative counts of zeros.
		// The size is n+1 for the same reason.
		int[] zeroCounts = new int[n + 1];

		// Pre-compute prefix sums and zero counts
		for (int i = 0; i < n; i++) {
			prefixSums[i + 1] = prefixSums[i] + numbers.get(i);
			zeroCounts[i + 1] = zeroCounts[i];
			if (numbers.get(i) == 0) {
				zeroCounts[i + 1]++;
			}
		}

		List<Long> results = new ArrayList<>();

		// Process each query in O(1) time
		for (List<Integer> query : queries) {
			int l = query.get(0);
			int r = query.get(1);
			int x = query.get(2);

			// Calculate subarray sum using prefix sums
			long subArraySum = prefixSums[r] - prefixSums[l - 1];

			// Calculate zero count using prefix counts
			int subArrayZeros = zeroCounts[r] - zeroCounts[l - 1];

			// Add the bonus for zeros to the sum
			long finalSum = subArraySum + (long) subArrayZeros * x;

			results.add(finalSum);
		}

		return results;
	}
}
