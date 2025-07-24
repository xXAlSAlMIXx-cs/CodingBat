public class diff21 {
    //This class contains methods that solve various problems from CodingBat.
    //The methods are designed to return boolean values or strings based on the input parameters.
    
    public static void main(String[] args) {
        // You can test the methods here
        diff21 mm = new diff21();
        System.out.println(mm.diff21(19)); // 2
        System.out.println(mm.diff21(10)); // 11
        System.out.println(mm.diff21(21)); // 0
    }
    
    public int diff21(int n) {
        if (n <=21){
            return 21-n ;
        }else{
            return (n-21)*2;
        }
    }
}
   