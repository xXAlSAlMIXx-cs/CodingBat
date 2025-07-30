public class maxSpan {  
    public int maxSpan(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int index=1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    if((j-i+1)>index){
                        index=(j-i+1);
                    }
                }
            }
        }
        return index;
    }
}