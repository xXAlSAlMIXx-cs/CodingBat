public class frontBack {
    public static void main(String[] args) {
        frontBack fb = new frontBack();
        System.out.println(fb.frontBack("code")); // "eodc"
        System.out.println(fb.frontBack("a")); // "a"
        System.out.println(fb.frontBack("ab")); // "ba"
        System.out.println(fb.frontBack("abcde")); // "ebcda"
    }
    public String frontBack(String str) {
        if (str.length()>1) {
            String first = String.valueOf(str.charAt(0));
            String last = String.valueOf(str.charAt(str.length()-1));
            str= last +str.substring(1,str.length()-1)+first;
            return str;
        }
        else {
            return str;
        }
    }
}
