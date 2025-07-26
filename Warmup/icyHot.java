public class icyHot {
    public static void main(String[] args) {
        icyHot ih = new icyHot();
        System.out.println(ih.icyHot(120, -1));
        System.out.println(ih.icyHot(-1, 120));
        System.out.println(ih.icyHot(2, 120));
        System.out.println(ih.icyHot(-1, 100));
    }

    //icyHot
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 >100 && temp2<0)|| (temp2>100 && temp1<0)) {
            return true;
        }
        return false;
    }
}
