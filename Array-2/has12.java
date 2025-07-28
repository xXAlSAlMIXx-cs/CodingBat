public class has12 {
    public boolean has12(int[] nums) {
        boolean check1 = false;
        boolean check2 = false;
        for(int num : nums){
            if(num==1){
                check1=true;
            }
            if(num==2 && check1){
                check2=true;
            }
        }
        return check2;
    }
}
