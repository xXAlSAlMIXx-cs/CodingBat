public class makeMiddle {
    public int[] makeMiddle(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }
        int middle = nums.length / 2;
        return new int[] { nums[middle - 1], nums[middle] };
    }
}
