public class front22 {
    public static void main(String[] args) {
        front22 fb = new front22();
        System.out.println(fb.front22("code")); 
        System.out.println(fb.front22("a")); 
        System.out.println(fb.front22("ab")); 
        System.out.println(fb.front22("abcde")); 
        System.out.println(fb.front22("x")); 
        System.out.println(fb.front22("xx")); 

    }
    //front22
    public String front22(String str) {
        if (str.length()>2) {
            String firsttwochar = str.substring(0,2);
            return firsttwochar+str+firsttwochar;
        }
        else if (str.length()==1 || str.length()==2) {
            return str+str+str;
        }
        return str;
    }

}
