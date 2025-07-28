public class repeatFront {
    public String repeatFront(String str, int n) {
        String front = str.substring(0, n);
        String result = "";
        for (int i = 0; i < n; i++) {
            result += front.substring(0,n - i);
        }
        return result;
    }
}
