package Recursion_2;

import java.util.Arrays;

public class split53 {
        public boolean split53(int[] nums) {
        return summing(nums, 0, 0, 0);
    }

    public boolean summing(int[] nums, int index, int group1Sum, int group2Sum) {
        if (index >= nums.length) {
            return (group1Sum==group2Sum);
        }
        else if (nums[index]%5==0) {    
            if (summing(nums, index + 1, group1Sum + nums[index], group2Sum)) {
                return true;
            }
        }
        else if(nums[index]%3==0){
            if (summing(nums, index + 1, group1Sum, group2Sum + nums[index])) {
                return true;
            }
        }
        else{
            if (summing(nums, index + 1, group1Sum + nums[index], group2Sum)) {
                return true;
            }
            
            if (summing(nums, index + 1, group1Sum, group2Sum + nums[index])) {
                return true;
            }        
        }
        return false;
    }
}