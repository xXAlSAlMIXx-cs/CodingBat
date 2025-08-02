package AP_1;

public class scoreUp {
    public int scoreUp(String[] key, String[] answers) {
        int grade = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equals("?")) {
                continue;
            }
            else if (answers[i].equals(key[i])) {
                grade+=4;
            }
            else{
                grade--;
            }
        }return grade;
    }
}