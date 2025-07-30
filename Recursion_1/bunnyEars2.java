package Recursion_1;

public class bunnyEars2 {
    public int bunnyEars2(int bunnies) {
        if (bunnies==0) {
            return 0;
        }
        if (bunnies==1) {
            return 2;
        }
        if (bunnies==2) {
            return 5;
        }
        int ears;
        if ((bunnies%2)==1) {
            ears=2;
        }else{
            ears=3;
        }

        return ears + bunnyEars2(bunnies-1);
    }   

}
