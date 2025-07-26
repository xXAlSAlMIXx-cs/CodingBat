public class last2 {
      public int last2(String str) {
        int counter=0;
        if (str.length()>2) {
            String part= str.substring(str.length()-2,str.length());
            System.out.println(part);
            for(int i=0;i<str.length()-2;i++){
                if(part.equals(str.substring(i,i+2))){
                    counter++;
                }
            }
        }
        return counter;
    }


}
