public class startOz {
    public static void main(String[] args) {
        startOz so = new startOz();
        System.out.println(so.startOz("ozymandias"));
        System.out.println(so.startOz("breeze"));
        System.out.println(so.startOz("oz"));
        System.out.println(so.startOz("o"));
        System.out.println(so.startOz("z"));
        System.out.println(so.startOz("abc"));
    }
    //startOz
    public String startOz(String str) {
        String oz = "";
        if (str.length()>=2) {
            if (str.substring(0,2).equals("oz")) {
                oz = str.substring(0,2);
            }else if (str.charAt(0)=='o') {
                oz = "o";
            }else if (str.charAt(1)=='z' || str.charAt(1)=='Z') {
                oz = "z";
            }
        } else if (str.length()==1) {
            if (str.charAt(0) == 'o') {
                oz = "o";
            }else if (str.charAt(0)=='z') {
                oz = "z";
            }
        }
        return oz;
    }
    
}
