public class stringSplosion {
        public String stringSplosion(String str) {
        String newstring="";
        for (int i = 0; i < str.length(); i++) {
            newstring+=str.substring(0,i+1);
        }
        return newstring;
    }
}
