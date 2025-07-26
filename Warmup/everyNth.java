public class everyNth {
    public static void main(String[] args) {
        everyNth en = new everyNth();
        System.out.println(en.everyNth("Hello", 2));
        System.out.println(en.everyNth("abcdefg", 3));
        System.out.println(en.everyNth("ab", 1));
        System.out.println(en.everyNth("", 1));
    }
  //everyNth
    public String everyNth(String str, int n) {
        String ss="";
        for (int i = 0; i < str.length(); i++) {
            if (i%n==0)
                ss= ss+str.charAt(i);
        }
        return ss;
    }
    
}
