public class closeFar {
    public boolean closeFar(int a, int b, int c) {
        boolean abClose = Math.abs(a - b) <= 1;
        boolean acClose = Math.abs(a - c) <= 1;
        boolean bcClose = Math.abs(b - c) <= 1;

        if (abClose && !acClose && !bcClose) {
            return true;
        } else if (acClose && !abClose && !bcClose) {
            return true;
        } else if (bcClose && !abClose && !acClose) {
            return true;
        }
        return false;
    }
}
