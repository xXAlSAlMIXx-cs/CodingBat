package AP_1;

import Recursion_1.count11;

public class commonTwo {
    public int commonTwo(String[] a, String[] b) {
        int count = 0;
        int i = 0, j = 0;
        
        while (i < a.length && j < b.length) {
            int compare = a[i].compareTo(b[j]);
            
            if (compare == 0) {
                count++;
                String current = a[i];
                while (i < a.length && a[i].equals(current)) {
                    i++;
                }
                while (j < b.length && b[j].equals(current)) {
                    j++;
                }
            }
            else if (compare < 0) {
                String current = a[i];
                while (i < a.length && a[i].equals(current)) {
                    i++;
                }
            }
            else {
                String current = b[j];
                while (j < b.length && b[j].equals(current)) {
                    j++;
                }
            }
        }
        
        return count;
    }
}
