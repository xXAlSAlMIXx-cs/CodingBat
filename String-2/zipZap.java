public class zipZap {
    public String zipZap(String str) {
        if(str.length() <= 2) {
            return str; 
        }else{
            String result=""   ;
            for (int i=0; i<str.length(); i++) {
                if(str.charAt(i)=='z' && str.charAt(i+2)=='p') {
                    result += "zp";
                    i+=2;
                } else {
                    result += str.charAt(i);
                }
            }
            return result;
        }
    }    
}
