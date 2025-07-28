public class has77 {
    public boolean has77(int[] nums){
        if(nums.length>=3){
            for (int i = 1; i < nums.length-1; i++) {
                if(nums[i-1] == 7 && nums[i+1]==7){
                    return true;
                }
            }
        }
        
        for (int j = 0; j < nums.length-1; j++) {
            if(nums[j]==nums[j+1] && nums[j+1] ==7){    
                return true;
            }
        }
        return false;
    }
}