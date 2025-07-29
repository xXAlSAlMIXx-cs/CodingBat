public class fizzArray3 {
    public int[] fizzArray3(int start, int end) {
        int [] numsbetween =new int[end-start];
        for (int i = 0; i < (end-start); i++) {
            numsbetween[i]=start+i;
        }
        return numsbetween;
    }
  
}
