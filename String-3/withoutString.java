public class withoutString {
    public String withoutString(String base, String remove) {
        StringBuilder result = new StringBuilder();
        int removeLength = remove.length();
        
        for (int i = 0; i < base.length(); i++) {
            if (i + removeLength <= base.length() && 
                base.substring(i, i + removeLength).equalsIgnoreCase(remove)) {
                i += removeLength - 1; 
            } else {
                result.append(base.charAt(i));
            }
        }
        
        return result.toString();
    }
}
