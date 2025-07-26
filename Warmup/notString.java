public class notString {
    public static void main(String[] args) {
        notString ns = new notString(); 
        System.out.println(ns.notString("candy")); // "not candy"
        System.out.println(ns.notString("x")); // "not x"
        System.out.println(ns.notString("not bad")); // "not bad"
        System.out.println(ns.notString("not")); // "not"
        System.out.println(ns.notString("not not bad")); // "not not bad"
        System.out.println(ns.notString("not bad not")); // "not bad not"}
    }
        public String notString(String str) {
        String [] ss = str.split(" ");
        if (ss.length >0) {
            if (ss[0].equals("not")){
                return str;
            }
        }
        return "not " + str;
    }
}
