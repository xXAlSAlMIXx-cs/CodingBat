public class xyzThere {
    public boolean xyzThere(String str) {
        if(str.contains("xyz")){
            if(!str.contains(".xyz")){
                return true; 
            }
            String ss=str.replace(".xyz", "");
            if(ss.contains("xyz")){
                return true;
            }
            return false;
        }
        return false;
    }
}
