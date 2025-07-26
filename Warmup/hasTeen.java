public class hasTeen {
    public static void main(String[] args) {
        hasTeen n = new hasTeen();
        System.out.println(n.hasTeen(13, 20, 10)); 
        System.out.println(n.hasTeen(20, 19, 10));
        System.out.println(n.hasTeen(20, 10, 13));
        System.out.println(n.hasTeen(20, 10, 22));
        System.out.println(n.hasTeen(22, 23, 24));  
    }
        //hasTeen
    public boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <=19)) {
            return true;
        }
        return false;
    }
}

