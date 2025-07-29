public class withoutTen {
    public int[] withoutTen(int[] nums) {
        int counter=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=10) {
                nums[counter]=nums[i];
                counter++;
            }
        }
        while (counter<nums.length) {
            nums[counter]=0;
            counter++;
        }
        return nums;
    }
}
