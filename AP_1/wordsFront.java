package AP_1;

public class wordsFront {
    public String[] wordsFront(String[] words, int n) {
        String [] firstChars= new String[n];
        for (int i = 0; i < n; i++) {
            firstChars[i]=words[i];
        }
        return firstChars;
    }

}
