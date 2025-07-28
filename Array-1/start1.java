public class start1 {
    public int start1(int[] a, int[] b) {
        int counter=0;
        boolean aFirst= (a.length>0&&a[0]==1);
        boolean bFirst= (b.length>0&&b[0]==1);
        if (aFirst) {
            counter++;
        }
        if (bFirst) {
            counter++;
        }
        return counter;
    }
}
