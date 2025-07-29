public class zeroMax {
    public int[] zeroMax(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==0){
                int index =i;
                int temp=-1;
                while (index <nums.length) {
                    if(nums[index]%2==1 && nums[index]>temp){
                        temp=nums[index];
                    }
                    index++;
                }
                if (temp != -1) {
                    nums[i]=temp;
                }
            }
        }
        return nums;
    }
}
