public class modThree {
    public boolean modThree(int[] nums) {
        if(nums.length<3){
            return false;
        }
        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i-1]%2==1 && nums[i]%2==1 && nums[i+1]%2==1 ){
                return true;
            }else if(nums[i-1]%2==0 && nums[i]%2==0 && nums[i+1]%2==0 ){
                return true;
            }
            
        }
        return false;
    }
}
