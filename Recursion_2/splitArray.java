package Recursion_2;

public class splitArray {
    public boolean splitArray(int[] nums) {
        return computeSumAndSplit(nums, 0, 0);
    }

    private boolean computeSumAndSplit(int[] nums, int index, int totalSum) {
        if (index >= nums.length) {
            if (totalSum % 2 != 0) {
                return false; 
            }
            return splitArrayHelper(nums, 0, 0, totalSum / 2);
        }
        return computeSumAndSplit(nums, index + 1, totalSum + nums[index]);
    }

    private boolean splitArrayHelper(int[] nums, int index, int group1Sum, int target) {
        if (index >= nums.length) {
            return group1Sum == target;
        }
        
        if (splitArrayHelper(nums, index + 1, group1Sum + nums[index], target)) {
            return true;
        }
        
        if (splitArrayHelper(nums, index + 1, group1Sum, target)) {
            return true;
        }
        
        return false;
    }
}
