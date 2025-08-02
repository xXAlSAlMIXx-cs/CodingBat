package AP_1;

public class mergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int i = 0; 
        int j = 0; 
        int k = 0; 
        
        while (k < n) {
            if (i < a.length && j < b.length && a[i].equals(b[j])) {
                result[k] = a[i];
                i++;
                j++;
                k++;
            }
            else if (i >= a.length || (j < b.length && b[j].compareTo(a[i]) < 0)) {
                result[k] = b[j];
                j++;
                k++;
            }
            else {
                result[k] = a[i];
                i++;
                k++;
            }
        }
        
        return result;
    }
}
