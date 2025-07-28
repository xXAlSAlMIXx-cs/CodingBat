public class front11 {
    public int[] front11(int[] a, int[] b) {
        int sizea = a.length;
        int sizeb = b.length;
        if(sizea >=1 && sizeb >= 1) {
            return new int[]{a[0], b[0]};
        }else if(sizea==0) {
            if (sizeb >= 1) 
                return new int[]{b[0]};
        }else if(sizeb==0) {
            if (sizea >= 1) 
                return new int[]{a[0]};
        }
        return new int[0]; 
    }
}
