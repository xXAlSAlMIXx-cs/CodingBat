public class makeLast {
    public int[] makeLast(int[] nums) {
        int [] newnum = new int[nums.length * 2];
        for (int i = 0; i < newnum.length; i++) {
            if (newnum.length-1==i) {
                newnum[i] = nums[nums.length - 1];
            }else {
                newnum[i] = 0;
            }
        }
        return newnum;
    }
}