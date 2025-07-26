public class max1020 {
    public static void main(String[] args) {
        max1020 m = new max1020();
        System.out.println(m.max1020(11, 19));
        System.out.println(m.max1020(19, 11));
        System.out.println(m.max1020(11, 9));
        System.out.println(m.max1020(21, 19));
        System.out.println(m.max1020(9, 21));
        System.out.println(m.max1020(10, 20));
    }
    //max1020
    public int max1020(int a, int b) {
        if ((a>=10 && a<=20) && ( b>=10 && b<=20)){
            return Math.max(a,b);
        }
        else if(a>=10 && a<=20){
            return a;
        } else if  ( b>=10 && b<=20) {
            return b;
        }
        return 0;
    }
    
}
