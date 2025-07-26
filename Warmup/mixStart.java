public class mixStart {
    public static void main(String[] args) {
        mixStart ms = new mixStart();
        System.out.println(ms.mixStart("mix snacks"));
        System.out.println(ms.mixStart("pix snacks"));
        System.out.println(ms.mixStart("piz snacks"));
        System.out.println(ms.mixStart("nix"));
        System.out.println(ms.mixStart("ni"));
    }
   //mixStart
    public boolean mixStart(String str) {
        if (str.length()>=3) {
            String dd= str.substring(1,3);
            if (dd.equals("ix")){
                return true;
            }
        }
        return false;
    }
    
}
