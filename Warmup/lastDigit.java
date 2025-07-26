public class lastDigit {
    public static void main(String[] args) {
        lastDigit ld = new lastDigit();
        System.out.println(ld.lastDigit(7, 17)); 
        System.out.println(ld.lastDigit(6, 17)); 
        System.out.println(ld.lastDigit(3, 113)); 
        System.out.println(ld.lastDigit(10, 0));
        System.out.println(ld.lastDigit(10, 1));
    }

    //lastDigit
    public boolean lastDigit(int a, int b) {
        String aa= Integer.toString(a);
        String bb= Integer.toString(b);
        if (aa.charAt(aa.length()-1)==bb.charAt(bb.length()-1)) {
            return true;
        }
        return false;
    }    
}