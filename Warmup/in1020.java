public class in1020 {
    public static void main(String[] args) {
        in1020 n = new in1020();    
        System.out.println(n.in1020(12, 99)); 
        System.out.println(n.in1020(21, 19));
        System.out.println(n.in1020(12, 18));
        System.out.println(n.in1020(9, 21));
    }

        //in1020
    public boolean in1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            return true;
        }
        return false;
    }
}