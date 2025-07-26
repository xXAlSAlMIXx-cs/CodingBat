public class loneTeen {
    public static void main(String[] args) {
        loneTeen n = new loneTeen();
        System.out.println(n.loneTeen(13, 99));
        System.out.println(n.loneTeen(21, 19));
        System.out.println(n.loneTeen(12, 18));
    }

        //loneTeen
    public boolean loneTeen(int a, int b) {
        boolean aa = a>=12 && a<=19;
        boolean bb = b>=12 && b<=19;
        if (aa != bb) {
            return true;
        }
        return false;
    }
 
}


