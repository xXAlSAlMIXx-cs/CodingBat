class parrotTrouble {
    public static void main(String[] args) {
        parrotTrouble obj = new parrotTrouble();
        System.out.println(obj.parrotTrouble(true, 6)); // true
        System.out.println(obj.parrotTrouble(false, 6)); // false
        System.out.println(obj.parrotTrouble(true, 21)); // true
        System.out.println(obj.parrotTrouble(false, 21)); // false
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour >20 || hour < 7)  ) {
            return true;
        }else return false;
    }


   }
 // Example method: parrotTrouble
