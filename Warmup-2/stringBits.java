public class stringBits {
        public String stringBits(String str) {
        String ss= "";
        for (int i = 0; i < str.length(); i++) {
            if(i%2==0){
                ss+=str.charAt(i);
            }
        }
        return ss;
    }
}
