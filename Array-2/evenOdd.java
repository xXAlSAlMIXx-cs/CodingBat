public class evenOdd {
    public int[] evenOdd(int[] nums) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] % 2 != 0 && nums[i + 1] % 2 == 0) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        return nums;
    }   
}
