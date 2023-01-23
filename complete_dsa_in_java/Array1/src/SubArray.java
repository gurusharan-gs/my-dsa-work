
public class SubArray {

   public static int shortestSubarray(int N, int C, int[] A) {
		int left = 0;
		int right = 0;
		int count = 0;
		int ans = Integer.MAX_VALUE;

		int[] colors = new int[C + 1];
		while (right < N) {
			if (colors[A[right++]]++ == 0) {
				count++;
			}
			while (count == C) {
				ans = Math.min(ans, right - left);
				if (colors[A[left++]]-- == 1) {
					count--;
				}
			}
		}
		if (ans == Integer.MAX_VALUE) {
			return -1;
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int n = arr.length;
		int c = 4;
		int res = shortestSubarray(n, c, arr);
		System.out.println(res);
	}
}
