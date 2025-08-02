package AP_1;

import java.util.Arrays;

public class copyEvens {
    public int[] copyEvens(int[] nums, int count) {
        return Arrays.stream(nums).filter(n -> (n % 2 == 0)).limit(count).toArray();
    }

}
