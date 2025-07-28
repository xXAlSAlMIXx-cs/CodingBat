public class either24 {
    public boolean either24(int[] nums) {
        boolean check2 = false;
        boolean check4 = false;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==2 && nums[i+1]==2){
                check2=true;
            }else if(nums[i]==4 && nums[i+1]==4){
                check4 = true;
            }
        }
        if(check2==true==check4){
            return false;
        }
        return (check2|| check4);
    }
}
