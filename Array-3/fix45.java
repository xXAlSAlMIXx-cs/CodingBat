import java.util.ArrayList;

public class fix45 {
    public int[] fix45(int[] nums) {
        ArrayList<Integer> free5s = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4)) {
                free5s.add(j);
            }
        }
        
        int freeIndex = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                if (i < nums.length - 1 && nums[i + 1] == 5) {
                    continue; 
                } else if (i < nums.length - 1) {
                    int k = free5s.get(freeIndex);
                    freeIndex++;
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[k];
                    nums[k] = temp;
                }
            }
        }
        return nums;
    }
}
