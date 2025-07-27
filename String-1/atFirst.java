public class atFirst {
    public String atFirst(String str) {
        if(str.length() ==1){
            return str + "@"; // If the string is 1 character, append '@'
        } else if (str.length() == 2) {
            return str;
        }else if (str.length()==0){
            return "@@";
        }else{
            return str.substring(0, 2);
        }
    }
}
