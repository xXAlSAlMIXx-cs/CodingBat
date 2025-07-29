public class zeroFront {
    public int[] zeroFront(int[] nums) {
        int zeroCounter=0;
        int [] non_zero=new int[nums.length];
        for (int i = 0; i < non_zero.length; i++) {
            if (nums[i]==0) {
                zeroCounter++;
            }
        }
        for (int i = 0; i < non_zero.length; i++) {
            non_zero[i]=0;
        }
        for (int i = 0; i < non_zero.length; i++) {
            if(nums[i]!=0){
                non_zero[zeroCounter]=nums[i];
                zeroCounter++;
            }
        }
        return non_zero;
    }
}
