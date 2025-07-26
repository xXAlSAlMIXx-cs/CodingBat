public class startHi{
    public static void main(String[] args) {
        startHi sh = new startHi();
        System.out.println(sh.startHi("hi there")); 
        System.out.println(sh.startHi("hi"));
        System.out.println(sh.startHi("hello hi")); 
        System.out.println(sh.startHi("hi hi")); 
    }
    //startHi
    public boolean startHi(String str) {
        if (str.length()>=2) {
            String hi=str.substring(0,2);
            if(hi.equals("hi")){
                return true;
            }
            return false;
        }
        return false;
    }
}
