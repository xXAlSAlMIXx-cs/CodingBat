public class withoutX {
    public String withoutX(String str) {
        if(str.length() <= 2) {
            return str.replaceAll("x", "");
        }
        else{
            boolean firstX = str.charAt(0) == 'x';
            boolean lastX = str.charAt(str.length()-1) == 'x';
            if(firstX && lastX) {
                return str.substring(1, str.length() - 1);
            } else if (firstX) {
                return str.substring(1, str.length());
            } else if (lastX) {
                return str.substring(0, str.length() - 1);
            } else {
                return str;
            }
        }
    }
}
