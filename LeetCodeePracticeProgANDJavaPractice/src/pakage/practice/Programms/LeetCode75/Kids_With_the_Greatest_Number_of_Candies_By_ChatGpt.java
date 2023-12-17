package pakage.practice.Programms.LeetCode75;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies_By_ChatGpt {
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int maxCandies = getMaxCandies(candies);

		List<Boolean> result = new ArrayList<>();
		for (int candy : candies) {
			result.add(candy + extraCandies >= maxCandies);
		}

		return result;
	}

	private static int getMaxCandies(int[] candies) {
		int max = candies[0];
		for (int i = 1; i < candies.length; i++) {
			max = Math.max(max, candies[i]);
		}
		return max;
	}

	public static void main(String[] args) {
		// Example 1:
		int[] candies1 = { 2, 3, 5, 1, 3 };
		int extraCandies1 = 3;
		System.out.println(kidsWithCandies(candies1, extraCandies1)); // Output: [true, true, true, false, true]

		// Example 2:
		int[] candies2 = { 4, 2, 1, 1, 2 };
		int extraCandies2 = 1;
		System.out.println(kidsWithCandies(candies2, extraCandies2)); // Output: [true, false, false, false, false]

		// Example 3:
		int[] candies3 = { 12, 1, 12 };
		int extraCandies3 = 10;
		System.out.println(kidsWithCandies(candies3, extraCandies3)); // Output: [true, false, true]
	}
}
