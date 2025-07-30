public class seriesUp {
    public int[] seriesUp(int n) {
        int [] nums = new int[n*(n+1)/2];
        int round=n;
        int index=round;
        for (int i = nums.length-1; i > -1; i--) {
            nums[i]=index;
            if(index>1){
                index--;
            }else{
                round--;
                index=round;
            }
        }
        return nums;
    }
}
