public class conCat {
    public String conCat(String a, String b) {
        if (!a.isEmpty() && !b.isEmpty()){
            if (a.charAt(a.length() - 1) == b.charAt(0)) {
                if (b.length() > 1) {
                    return a + b.substring(1);
                } return a;
                
            }
        }
        return a + b;
    }
}
