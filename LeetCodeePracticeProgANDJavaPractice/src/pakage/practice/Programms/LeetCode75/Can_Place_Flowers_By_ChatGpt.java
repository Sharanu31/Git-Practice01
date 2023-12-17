package pakage.practice.Programms.LeetCode75;

public class Can_Place_Flowers_By_ChatGpt {

	public static void main(String[] args) { // 0 = empty
		int n = 0; // 1= not empty
		int[] flowerbed = { 1, 0, 0, 0, 1 };
		n = 1;
		System.out.println(new Can_Place_Flowers_By_ChatGpt().canPlaceFlowers(flowerbed, n));
		int[] flowerbed1 = { 1, 0, 0, 0, 1 };
		n = 2;
		System.out.println(new Can_Place_Flowers_By_ChatGpt().canPlaceFlowers(flowerbed1, n));

	}

	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count = 0;
		int length = flowerbed.length;

		for (int i = 0; i < length; i++) {
			if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == length - 1 || flowerbed[i + 1] == 0)) {
				flowerbed[i] = 1;
				count++;
				i++; // Skip the next plot as it cannot have a flower.
			}
		}

		return count >= n;
	}
}
