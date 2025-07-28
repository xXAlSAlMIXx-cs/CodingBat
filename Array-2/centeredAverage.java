public class centeredAverage {
    public int centeredAverage(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
            sum += n;
        }

        return (sum - min - max) / (nums.length - 2);
    }
}
