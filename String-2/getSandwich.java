public class getSandwich {
    public String getSandwich(String str) {
        int firstBread = str.indexOf("bread");
        int lastBread = str.lastIndexOf("bread");

        if (firstBread == -1 || lastBread == -1 || firstBread == lastBread) {
            return "";
        }

        return str.substring(firstBread + 5, lastBread);
    }
}
