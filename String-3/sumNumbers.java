public class sumNumbers {
    public int sumNumbers(String str) {
        int sum = 0;
        if(str.isEmpty()) {
            return 0;
        }
        String [] number = str.split("[a-zA-Z\\s!;:$.,]+");
        if (number.length == 0) {
            return 0;
        }
        if(number.length ==1){
            return Integer.parseInt(number[0]);
        }
        for (String num : number) {
            if (!num.isEmpty()) {
                sum += Integer.parseInt(num);
            }
        }
        return sum;
    }

}
