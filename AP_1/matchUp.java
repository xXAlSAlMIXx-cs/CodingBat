package AP_1;

public class matchUp {
    public int matchUp(String[] a, String[] b) {
        int counter=0;
        for (int i = 0; i < b.length; i++) {
            int lenA= a[i].length();
            int lenB= b[i].length();
            if (lenA>0 && lenB>0) { 
                if (lenA>=lenB) {   
                    if (a[i].contains(b[i])) {
                        counter++;
                    }   
                }else{
                    if (b[i].contains(a[i])) {
                        counter++;
                    }   
                }
            }
        }
        return counter;
    }
}
