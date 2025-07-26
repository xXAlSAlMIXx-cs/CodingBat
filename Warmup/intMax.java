public class intMax {
    public static void main(String[] args) {
        intMax n = new intMax();
        System.out.println(n.intMax(1, 2, 3));
        System.out.println(n.intMax(1, 3, 2));
        System.out.println(n.intMax(3, 2, 1));
        System.out.println(n.intMax(9, 3, 2));
        System.out.println(n.intMax(1, 9, 2));
        System.out.println(n.intMax(1, 2, 9));
    }

    //intMax
    public int intMax(int a, int b, int c) {
        return Math.max(Math.max(a,b),c);
    }
    
}
