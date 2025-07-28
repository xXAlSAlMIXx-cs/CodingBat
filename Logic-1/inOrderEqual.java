public class inOrderEqual {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            return c >= b && b >= a;
        }
        return b > a && c > b;
    }
}
