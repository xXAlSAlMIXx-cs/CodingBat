public class missingChar{
    public static void main(String[] args) {
        missingChar mc = new missingChar();
        System.out.println(mc.missingChar("kitten", 1)); // "ktten"
        System.out.println(mc.missingChar("kitten", 0)); // "itten"
        System.out.println(mc.missingChar("kitten", 4)); // "kittn"
        System.out.println(mc.missingChar("hello", 2)); // "helo"
    }
      public String missingChar(String str, int n) {
        String str1= str.substring(0,n);
        String str2= str.substring(n+1,str.length());
        return str1+str2;
    }  
}
