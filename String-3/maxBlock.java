public class maxBlock {
    public int maxBlock(String str) {
        int maxCount = 0;
        int currentCount = 1;
        if (str.isEmpty()) {
            return 0;
        }
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 1;
            }
        }
        maxCount = Math.max(maxCount, currentCount);
        return maxCount;
    }
}
