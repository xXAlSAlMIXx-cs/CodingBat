public class maxTriple {
    public int maxTriple(int[] nums) {
        int middle= nums.length / 2;
        int first = nums[0];
        int last = nums[nums.length - 1];
        return Math.max(first, Math.max(last, nums[middle]));
    }
}
