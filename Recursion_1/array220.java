package Recursion_1;

public class array220 {
    public boolean array220(int[] nums, int index) {
        if (index==nums.length) {
            return false;
        }
        if (index>=1 && (nums[index-1]*10)==nums[index]) {
            return true;
        }
        return array220(nums, index+1);
    }
}
