public class twoTwo {
    public boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (i == nums.length - 1 || nums[i + 1] != 2) {
                    if (i == 0 || nums[i - 1] != 2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
