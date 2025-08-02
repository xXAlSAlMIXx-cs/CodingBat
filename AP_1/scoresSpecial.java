package AP_1;

public class scoresSpecial {
    public int scoresSpecial(int[] a, int[] b) {
        int aa = largestSpecial(a);
        int bb = largestSpecial(b);
        return aa + bb;
    }
    
    public int largestSpecial(int[] scores) {
        int max = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] % 10 == 0 && scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }
}

