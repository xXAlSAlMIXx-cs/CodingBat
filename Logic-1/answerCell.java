public class answerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
      if(isMorning){
        if(isAsleep && isMom && isMorning) {
            return false;
        }
        if (isMom) {
            return true;
        }
        }
        if (isAsleep) {
            return false;
        }
        if (isMom) {
            return true;
        }
        if(!isMorning && !isMom && !isAsleep) {
            return true;
        }
        return false;
    }
}
