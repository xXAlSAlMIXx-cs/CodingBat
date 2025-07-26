public class backAround {
    public static void main(String[] args) {
        backAround ba = new backAround();
        System.out.println(ba.backAround("code")); // "ecodec"
        System.out.println(ba.backAround("a")); // "aaa"
        System.out.println(ba.backAround("ab")); // "bab"
        System.out.println(ba.backAround("abcde")); // "eabcde"
        System.out.println(ba.backAround("x")); // "xxx"
        System.out.println(ba.backAround("xx")); // "xxx"
    }
        //backAround
    public String backAround(String str) {
        String lastChar = String.valueOf(str.charAt(str.length()-1));
        return lastChar+str+lastChar;
    }

}
