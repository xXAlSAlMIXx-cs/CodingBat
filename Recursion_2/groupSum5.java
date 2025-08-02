package Recursion_2;

public class groupSum5 {
    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        
        if (start > 0 && nums[start] == 1 && nums[start - 1] % 5 == 0) {
            return groupSum5(start + 1, nums, target);
        }
        
        if (nums[start] % 5 == 0) {
            return groupSum5(start + 1, nums, target - nums[start]);
        }
        
        return groupSum5(start + 1, nums, target - nums[start]) || 
            groupSum5(start + 1, nums, target);
    }
}

