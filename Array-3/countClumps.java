public class countClumps {
    public int countClumps(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int clumpCount = 0;
        boolean inClump = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                if (!inClump) {
                    clumpCount++;
                    inClump = true;
                }
            } else {
                inClump = false;
            }
        }
        return clumpCount;
    }

}
