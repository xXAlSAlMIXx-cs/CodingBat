public class delDel {
    public static void main(String[] args) {
        delDel dd = new delDel();
        System.out.println(dd.delDel("adelbc"));
        System.out.println(dd.delDel("adelHello"));
        System.out.println(dd.delDel("adedbc"));
        System.out.println(dd.delDel("abcde"));
        System.out.println(dd.delDel("del"));
    }

    //delDel
    public String delDel(String str) {
        if(str.length()>=4){
            String dell = str.substring(1,4);
            if(dell.equals("del")){
                return str.charAt(0)+str.substring(4,str.length());
            }
        }
        return str;
    }
    
}

