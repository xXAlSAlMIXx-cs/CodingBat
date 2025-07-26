public class doubleX {
        boolean doubleX(String str) {
        int i=0;
        boolean flage =true;
        while (i <str.length()-1 && flage) {
            if (str.charAt(i) == 'x' && str.charAt(i+1) == 'x') {
                return true;
            } else if (str.charAt(i)=='x') {
                flage = false;
            }
            i++;
        }
        return false;
    }
}
