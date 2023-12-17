package pakage.practice.Programms.LeetCode;

public class MonotonicArray {

	public boolean isMonotonic(int[] nums) {
		if (nums.length < 2)
			return true;
		int direction = 0; // 0 means unknown, 1 means increasing, -1 means decreasing

		for (int i = 1; i < nums.length; i++) {
			System.out.println("nums[i] = " + nums[i] +"\n i = " + i);
			
			System.out.println("nums[i-1] = " + nums[i - 1] +"\n i-1 = " + (i - 1));
			
			
			if (nums[i] > nums[i - 1]) { // increasing
				if (direction == 0)
					direction = 1;
				else if (direction == -1)
					return false;
			} else if (nums[i] < nums[i - 1]) { // decreasing
				if (direction == 0)
					direction = -1;
				else if (direction == 1)
					return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3 };
		new MonotonicArray().isMonotonic(nums);

	}

}
