public class without2 {
    public String without2(String str) {
        if (str.length() < 2) {
            return str;
        }else{
            String font =str.substring(0, 2);
            String back = str.substring(str.length() - 2);
            if (font.equals(back)) {
                return str.substring(2, str.length());
            } else {
                return str;
            }
        }
    }
}
