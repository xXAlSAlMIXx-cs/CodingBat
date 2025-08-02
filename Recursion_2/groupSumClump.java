package Recursion_2;

public class groupSumClump {
    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        
        int counter = 1 ;
        int sum = nums[start];
        int i = start+1;
        while (i <nums.length && nums[i]==nums[start]) {
            counter++;
            sum+=nums[start];
            i++;
        }
        
        
        return groupSumClump(start + counter, nums, target - sum) || 
            groupSumClump(start + counter, nums, target);
    }
}
//hardest one (; takes a lot to solve 