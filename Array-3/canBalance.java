public class canBalance {
    public boolean canBalance(int[] nums) {
        int total = 0;
        for(int n: nums){
            total+=n;
        }
        
        int firstsum=0;
        for (int i = 0; i < nums.length; i++) {
            firstsum+=nums[i];
            int secondsum = total-firstsum;
            if (secondsum==firstsum) {
                return true;
            }
        }
        return false;
    }

}