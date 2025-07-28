
public class fizzString2 {
    public String fizzString2(int n) {
        String result = "";
        
        if (n % 3 == 0) {
            result += "Fizz";
        }
        if (n % 5 == 0) {
            result += "Buzz";
        }
        if (result.isEmpty()) {
            result = String.valueOf(n);
        }
        
        return result + "!";
    }
}
