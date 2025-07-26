public class StringTimes {
    public static void main(String[] args) {
        StringTimes st = new StringTimes();
        System.out.println(st.stringTimes("Hi", 2));
        System.out.println(st.stringTimes("Hi", 3));
        System.out.println(st.stringTimes("Hi", 1));
    }
    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
    }
        return result;
    }
}