package AP_1;

import java.util.Arrays;

public class bigHeights {
    public int bigHeights(int[] heights, int start, int end) {
        int [] nums= Arrays.copyOfRange(heights, start, end+1);
        int sumDiff=0;
        int prev=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(Math.abs(prev-nums[i])>4){sumDiff++;}
            
            prev=nums[i];
        }
        return sumDiff;
    }   

}
