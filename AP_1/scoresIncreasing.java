package AP_1;

public class scoresIncreasing {
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length-1; i++) {
            if (scores[i]==100 && scores[i+1]=100) {
                return true;
            }
        }
        return false;
    }
}
