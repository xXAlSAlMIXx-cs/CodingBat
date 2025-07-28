public class makeEnds {
    public int[] makeEnds(int[] nums) {
        if (nums.length == 1) {
            return new int[]{nums[0], nums[0]};
        }
        return new int[]{nums[0], nums[nums.length - 1]};
    }    
}
