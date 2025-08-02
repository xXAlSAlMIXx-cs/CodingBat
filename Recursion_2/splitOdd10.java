package Recursion_2;

import java.util.Arrays;

public class splitOdd10 {
    public boolean splitOdd10(int[] nums) {
        return summing(nums, 0, 0, 0);
    }
    
    public int sum(int[] nums) {
        return Arrays.stream(nums).sum();
    }
    
    public boolean summing(int[] nums, int index, int group1Sum, int group2Sum) {
        // Base case: if all elements are processed, check conditions
        if (index >= nums.length) {
            return (group1Sum % 10 == 0 && group2Sum % 2 == 1) || 
                   (group2Sum % 10 == 0 && group1Sum % 2 == 1);
        }
        
        // Try adding current number to Group 1
        if (summing(nums, index + 1, group1Sum + nums[index], group2Sum)) {
            return true;
        }
        
        // Try adding current number to Group 2
        if (summing(nums, index + 1, group1Sum, group2Sum + nums[index])) {
            return true;
        }
        
        return false;
    }
}
