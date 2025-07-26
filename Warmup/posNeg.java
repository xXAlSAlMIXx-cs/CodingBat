public class posNeg {
    public static void main(String[] args) {
        posNeg n = new posNeg();
        System.out.println(n.posNeg(1, -1, false)); // true
        System.out.println(n.posNeg(-1, 1, false)); // true
        System.out.println(n.posNeg(-1, -1, true)); // true
        System.out.println(n.posNeg(1, 1, false)); // false
        System.out.println(n.posNeg(-1, 1, true)); // false
        System.out.println(n.posNeg(1, -1, true)); // false
        System.out.println(n.posNeg(-1, -2, true)); // true
        System.out.println(n.posNeg(1, 2, false)); // false
    }
    public boolean posNeg(int a, int b, boolean negative) {
        if( (a <0 && b >0 &&!negative )||(a >0 && b <0 && !negative) || (a <0 && b <0 &&negative)){
            return true;
        }
        return false;
    }

}
