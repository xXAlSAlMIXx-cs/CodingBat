public class firstLast6 {

    public boolean firstLast6(int[] nums) {
        if (nums.length == 0) {
            return false; // Handle empty array case
        }
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
}