class makes10 {
    public static void main(String[] args) {
        makes10 mm = new makes10();
        System.out.println(mm.makes10(9, 10)); // true
        System.out.println(mm.makes10(9, 9)); // false
        System.out.println(mm.makes10(1, 9)); // true
    }
    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10) {
            return true;
        }else if((a+b) == 10) {
            return true;
        }
        return false;
    }

}
