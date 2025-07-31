package Recursion_1;

public class powerN {
    public int powerN(int base, int n) {
        if (n==1) {
            return base;
        }
        if (n==0) {
            return 1;
        }
        return base * powerN(base, n-1);
    }
}
