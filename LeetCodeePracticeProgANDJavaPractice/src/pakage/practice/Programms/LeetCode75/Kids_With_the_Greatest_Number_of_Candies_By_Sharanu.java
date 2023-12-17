package pakage.practice.Programms.LeetCode75;

import java.util.LinkedList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies_By_Sharanu {

	public static void main(String[] args) {
		int[] candies = { 2, 3, 5, 1, 3 };
		int extraCandies = 3;
		System.out.println(
				new Kids_With_the_Greatest_Number_of_Candies_By_Sharanu().kidsWithCandies(candies, extraCandies));

		int[] candies1 = { 4, 2, 1, 1, 2 };
		extraCandies = 1;

		System.out.println(
				new Kids_With_the_Greatest_Number_of_Candies_By_Sharanu().kidsWithCandies(candies1, extraCandies));

		int[] candies2 = { 12, 1, 12 };
		extraCandies = 10;

		System.out.println(
				new Kids_With_the_Greatest_Number_of_Candies_By_Sharanu().kidsWithCandies(candies2, extraCandies));

	}

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int maxValue = maxValue(candies);
		List<Boolean> boolValues = new LinkedList<Boolean>();

		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= maxValue) {
				boolValues.add(true);
			} else {
				boolValues.add(false);
			}
		}
		return boolValues;

	}

	int maxValue(int[] values) {
		int max = 0;
		for (int value : values) {
			max = Math.max(max, value);
			//System.out.println(max);
		}
		return max;

	}

}
