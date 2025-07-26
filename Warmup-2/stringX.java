public class stringX {
        public String stringX(String str) {
        if (str.length()<2){
            return str;
        }
        String first = str.substring(0,1);
        String last = str.substring(str.length()-1);
        String sub = str.substring(0,str.length()-1);
        String newstr="";
        for (int i = 1; i < sub.length(); i++) {
            if (sub.charAt(i)!='x'){
                newstr+=sub.charAt(i);
            }

        }
        return first+newstr+last;
    }
}
