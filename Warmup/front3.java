public class front3 {
    public static void main(String[] args) {
        front3 fb = new front3();
        System.out.println(fb.front3("code")); // "codcodcod"
        System.out.println(fb.front3("a")); // "aaa"
        System.out.println(fb.front3("ab")); // "ababab"
        System.out.println(fb.front3("abcde")); // "abcabcabc"
    }
    //front3
    public String front3(String str) {
        if (str.length()>3) {
            return (str.substring(0,3)+str.substring(0,3)+str.substring(0,3));
        }
        else {
            return str+str+str;
        }
    }  
}
