package Recursion_1;

public class array6 {
    public boolean array6(int[] nums, int index) {
        if (nums.length == index) {
            return false;
        }
        if (nums[index]==6) {
            return true;
        }
        return false || array6(nums, index+1);
    }
   
}
