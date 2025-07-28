public class shareDigit {
    public boolean shareDigit(int a, int b) {
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        boolean acheck = bStr.contains(aStr.charAt(0) + "");
        boolean acheck2 = bStr.contains(aStr.charAt(1) + "");
        return acheck || acheck2;
    }
}
