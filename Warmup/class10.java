public class class10 {
    public static void main(String[] args) {
        class10 c10 = new class10();
        System.out.println(c10.close10(8, 13)); 
        System.out.println(c10.close10(13, 8));
        System.out.println(c10.close10(13, 7));
        System.out.println(c10.close10(7, 13));
        System.out.println(c10.close10(7, 8));
    }
        //close10
    public int close10(int a, int b) {
        int aa= Math.abs(a-10);
        int bb= Math.abs(b-10);
        if (aa<bb) {
            return a;
        }else if (bb<aa) {
            return b;
        }
        return 0;
    }
}
