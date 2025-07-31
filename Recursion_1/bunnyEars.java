package Recursion_1;

public class bunnyEars {
    public int bunnyEars(int bunnies) {
        if (bunnies==0) {
            return 0;
        }
        else if (bunnies==1) {
            return 2;
        }
        return 2+bunnyEars(bunnies-1);
    }

}
