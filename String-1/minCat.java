public class minCat {
    public String minCat(String a, String b) {
        int minLength = Math.min(a.length(), b.length());
        return a.substring(a.length() - minLength) + b.substring(b.length() - minLength);
    }
}
