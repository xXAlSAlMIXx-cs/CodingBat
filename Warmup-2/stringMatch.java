public class stringMatch {
        public int stringMatch(String a, String b) {
        int counter = 0;
        int minumim=0;
        if (a.length() > b.length()){
            minumim = b.length();
        }
        else minumim = a.length();

        for (int i = 0; i < minumim-1; i++) {
           String sub1 = a.substring(i,i+2);
           String sub2 = b.substring(i,i+2);
           if (sub1.equals(sub2)) {
               counter++;
           }
        }
        return counter;
    }



}
