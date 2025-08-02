package AP_1;

import java.util.Arrays;

public class copyEndy {
    public int[] copyEndy(int[] nums, int count) {
        return Arrays.stream(nums).filter(n -> ((n>=0 && n<=10)||(n>=90 && n<=100))).limit(count).toArray();
    }
}
