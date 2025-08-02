package AP_1;

import Recursion_1.factorial;

public class scoresClump {
    public boolean scoresClump(int[] scores) {
        if (scores.length < 3) {
            return false;
        }

        for (int i = 0; i < scores.length - 2; i++) {
            
            if (scores[i + 2] - scores[i] <= 2) {
                return true;
            }
        }
        return false;
    }
}
