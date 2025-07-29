public class pre4 {
    public int[] pre4(int[] nums) {
        int [] newnums;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==4){
                newnums=new int[i];
                for (int j = 0; j < i; j++) {
                    newnums[j]=nums[j];
                }
                return newnums;
            }
        }
        return nums;
    }
}