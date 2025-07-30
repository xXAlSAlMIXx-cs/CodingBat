public class maxMirror {
    
    public int maxMirror(int[] nums) {
        int left=0;
        int right=nums.length;
        int counter=0;
        int second_counter=0; // I will use this to compare between the current counter 
        //and the privous one to get the greater
        if (nums.length==0) {
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        while (left<=nums.length) {
            right=nums.length-1;
            while (right>=0) {
                int i= left;
                int j= right;
                counter=0;
                while (j>=0 && i < nums.length && nums[i]==nums[j]) {
                    counter++;
                    j--;i++;
                }
                second_counter=Math.max(counter,second_counter);
                right--;
            }
            left++;
        }
        return second_counter;
    }

}
