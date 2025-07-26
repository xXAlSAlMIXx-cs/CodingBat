public class frontTimes {
    public static void main(String[] args) {
         frontTimes ft = new frontTimes();
         System.out.println(ft.frontTimes("Chocolate", 2));
         System.out.println(ft.frontTimes("Chocolate", 3));
         System.out.println(ft.frontTimes("Abc", 1));
    }
    public String frontTimes(String str, int n) {
        String front;
        String result = "";
        if (str.length() < 3) {
            front = str;
        } else {
            front = str.substring(0, 3);
        }
        for (int i = 0; i < n; i++) {
            result += front;
        }
        return result;
    }
}