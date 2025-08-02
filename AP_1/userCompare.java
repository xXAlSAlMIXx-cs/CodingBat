package AP_1;

public class userCompare {
    public int userCompare(String aName, int aId, String bName, int bId) {
        if (aName.equals(bName)) {
            if(aId - bId > 0){
                return 1;
            }
            else if(aId - bId < 0){
                return -1;
            }
            return aId - bId; 
        }
        return aName.compareTo(bName) > 0 ? 1 : -1;
    }
}
