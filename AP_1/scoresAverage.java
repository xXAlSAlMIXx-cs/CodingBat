package AP_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class scoresAverage {
    public int scoresAverage(int[] scores) {
      if(scores.length==2){
        return Math.max(scores[0],scores[1]);
      }
      int middle = scores.length/2;
      int max= Math.max(avarage(scores, 0, middle),avarage(scores, middle,scores.length-1));
      return max;
    }
    public int avarage(int[] nums , int start, int end){
        int[] newn = Arrays.copyOfRange(nums, start, end);
        return Arrays.stream(newn).sum()/(newn.length);  
    }
}
