public class seeColor {
    public String seeColor(String str) {
       if(str.length() < 3) {
            return "";
        }
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }
}
