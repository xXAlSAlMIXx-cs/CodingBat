public class sum67 {
    public int sum67(int[] nums) {
        int sum = 0;
        boolean skip=false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==6) {
                skip=true;
            }
            if (!skip) {
                sum += nums[i];
            }
            if(nums[i]==7) {
                skip=false;
            }
        }
        return sum;
    }
}
