public class in3050 {
    public static void main(String[] args) {
        in3050 n = new in3050();
        System.out.println(n.in3050(30, 31));
        System.out.println(n.in3050(30, 41));
        System.out.println(n.in3050(40, 50));
        System.out.println(n.in3050(50, 30));
    }
    //in3050
    public boolean in3050(int a, int b) {
        if (a>=30 && b>=30 && a<=40 && b<=40){
            return true;
        } else if (a>=40 && b>=40 && a<=50 && b<=50) {
            return true;
        }
        return false;
    }

    
}

