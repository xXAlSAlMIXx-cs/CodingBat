public class altPairs {
     public String altPairs(String str) {
        if (str.length()<2){
            return str;
        }

        String newstr="";
        for (int i = 0; i < str.length(); i+=4) {
            if (i< str.length()-1) {
                newstr += str.substring(i, i + 2);
            }else {
                newstr += str.substring(i);
            }
        }
        return newstr;
    }

}
