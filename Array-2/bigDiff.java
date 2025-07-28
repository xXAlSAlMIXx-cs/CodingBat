public class bigDiff {
    public int bigDiff(int[] nums) {
        int minmum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n < minmum) {
                minmum = n;
        }
        if (n > maximum) {
            maximum = n;
        }
    }
    return maximum - minmum;
    }
}