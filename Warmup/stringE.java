public class stringE {
    public static void main(String[] args) {
        stringE se = new stringE();
        System.out.println(se.stringE("Hello"));
        System.out.println(se.stringE("Heelle"));
        System.out.println(se.stringE("Heelele"));
        System.out.println(se.stringE("e"));
        System.out.println(se.stringE("eeeee"));
    }
    //stringE
    public boolean stringE(String str) {
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='e') {
                count++;
            }
        }
        if (count>0 && count<4)
        {
            return true;
        }
        return false;
    }
    
}
