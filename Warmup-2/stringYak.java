public class stringYak {
        public String stringYak(String str) {
        if (str.length()<3){
            return str;
        }
        String ss=str.replaceAll("yak","");
        return ss;
    }

}
