public class endUp {
    public static void main(String[] args) {
        endUp eu = new endUp();
        System.out.println(eu.endUp("Hello"));
        System.out.println(eu.endUp("hi there"));
        System.out.println(eu.endUp("hi"));
        System.out.println(eu.endUp("x"));
    }
  //endUp
    public String endUp(String str) {
        if (str.length()>=3) {
            return str.substring(0,str.length()-3) +str.substring(str.length()-3,str.length()).toUpperCase();
        }
        return str.toUpperCase();
    }
    
}
