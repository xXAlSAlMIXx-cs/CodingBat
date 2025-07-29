public class tenRun {
    public int[] tenRun(int[] nums) {
        int current= 0;
        boolean flage=false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%10==0) {
                current=nums[i];
                flage=true;
            }
            if (flage) {
                nums[i]=current;
            }
        }
        return nums;
    }
}
