public class squareUp {
    public int[] squareUp(int n) {
        int [] nums= new int[n*n];
        int counter =1;
        for (int i = 0; i < n; i+=1) {
            for (int j = n*i; j <(n*(i+1)); j++) {
                if(counter>= Math.abs(n*(i+1)-j)){
                    nums[j]=n*(i+1)-j;
                }
            }
            counter++;
        }
        return nums;
    }
}
