class nearHundred{
    public static void main(String[] args) {
        nearHundred nh = new nearHundred();
        System.out.println(nh.nearHundred(90));  // true
        System.out.println(nh.nearHundred(89));  // false
        System.out.println(nh.nearHundred(191)); // true
        System.out.println(nh.nearHundred(210)); // true
        System.out.println(nh.nearHundred(211)); // false
}
    public boolean nearHundred(int n) {
        if (n <= 0) {
            return false;
        }
        if ((Math.abs(n)%10)==0 && ((n <=210) && (n > (-10)) )){
            return true;
        } else if ((n<100 && n>=90)) {
            return true;
        }else if ((n<10 )){
            return false;
        }else if ((n<210 && n>=190)){
            return true;
        }
        return false;
    }
}
