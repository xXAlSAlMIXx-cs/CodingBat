package AP_1;

import java.util.Arrays;

public class sumHeights {
    public int sumHeights(int[] heights, int start, int end) {
        int [] nums= Arrays.copyOfRange(heights, start, end+1);
        int sumDiff=0;
        int prev=nums[0];
        for (int i = 1; i < nums.length; i++) {
            sumDiff+=Math.abs(prev-nums[i]);
            prev=nums[i];
        }
        return sumDiff;
    }
}
