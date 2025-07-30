public class linearIn {
    public boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0) {
            return true; 
        }
        int i = 0; 
        int j = 0; 
        while (i < outer.length && j < inner.length) {
            if (outer[i] == inner[j]) {
                j++; 
            }
            i++; 
        }
    
    return j == inner.length; 
}
}
