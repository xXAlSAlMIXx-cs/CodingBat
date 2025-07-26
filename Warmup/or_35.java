public class or_35 {
    public static void main(String[] args) {
        or_35 n = new or_35();
        System.out.println(n.or35(3)); // true
        System.out.println(n.or35(10)); // true
        System.out.println(n.or35(8)); // false
        System.out.println(n.or35(15)); // true
        System.out.println(n.or35(7)); // false
    }
      //or35
    public boolean or35(int n) {
        if(n%3==0 || n%5==0){
            return true;
        }
        return false;
    }
}
