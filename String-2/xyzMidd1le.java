
public class xyzMidd1le {
  public boolean xyzMiddle(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                int leftChars = i;
                int rightChars = str.length() - (i + 3);
                if (Math.abs(leftChars - rightChars) <= 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
