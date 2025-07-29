import java.util.ArrayList;
import java.util.List;
public class fizzBuzz {
   public String[] fizzBuzz(int start, int end) {
   List<String> resultList = new ArrayList<>();
        
        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                resultList.add("Fizz");
            } else if (i % 5 == 0) {
                resultList.add("Buzz");
            } else {
                resultList.add(String.valueOf(i));
            }
        }
        
        return resultList.toArray(new String[0]);
    }
}
