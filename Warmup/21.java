public class 21 {
    
}

/*
    public String notString(String str) {
        String [] ss = str.split(" ");
        if (ss.length >0) {
            if (ss[0].equals("not")){
                return str;
            }
        }
        return "not " + str;
    }
    public String missingChar(String str, int n) {
        String str1= str.substring(0,n);
        String str2= str.substring(n+1,str.length());
        return str1+str2;
    }
    public String frontBack(String str) {
        if (str.length()>1) {
            String first = String.valueOf(str.charAt(0));
            String last = String.valueOf(str.charAt(str.length()-1));
            str= last +str.substring(1,str.length()-1)+first;
            return str;
        }
        else {
            return str;
        }
    }
    //front3
    public String front3(String str) {
        if (str.length()>3) {
            return (str.substring(0,3)+str.substring(0,3)+str.substring(0,3));
        }
        else {
            return str+str+str;
        }
    }
    //backAround
    public String backAround(String str) {
        String lastChar = String.valueOf(str.charAt(str.length()-1));
        return lastChar+str.substring(0,str.length())+lastChar;
    }
    //or35
    public boolean or35(int n) {
        if(n%3==0 || n%5==0){
            return true;
        }
        return false;
    }
    //front22
    public String front22(String str) {
        if (str.length()>2) {
            String firsttwochar = str.substring(0,2);
            return firsttwochar+str+firsttwochar;
        }
        else if (str.length()==1 || str.length()==2) {
            return str+str+str;
        }
        return str;
    }
    //startHi
    public boolean startHi(String str) {
        if (str.length()>=2) {
            String hi=str.substring(0,2);
            if(hi.equals("hi")){
                return true;
            }
            return false;
        }
        return false;
    }

    //icyHot
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 >100 && temp2<0)|| (temp2>100 && temp1<0)) {
            return true;
        }
        return false;
    }
    //in1020
    public boolean in1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            return true;
        }
        return false;
    }
    //hasTeen
    public boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <=19)) {
            return true;
        }
        return false;
    }
    //loneTeen
    public boolean loneTeen(int a, int b) {
        boolean aa = a>=12 && a<=19;
        boolean bb = b>=12 && b<=19;
        if (aa != bb) {
            return true;
        }
        return false;
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
    //mixStart
    public boolean mixStart(String str) {
        if (str.length()>=3) {
            String dd= str.substring(1,3);
            if (dd.equals("ix")){
                return true;
            }
        }
        return false;
    }
    //startOz
    public String startOz(String str) {
        String oz = "";
        if (str.length()>=2) {
            if (str.substring(0,2).equals("oz")) {
                oz = str.substring(0,2);
            }else if (str.charAt(0)=='o') {
                oz = "o";
            }else if (str.charAt(1)=='z' || str.charAt(1)=='Z') {
                oz = "z";
            }
        } else if (str.length()==1) {
            if (str.charAt(0) == 'o') {
                oz = "o";
            }else if (str.charAt(0)=='z') {
                oz = "z";
            }
        }
        return oz;
    }

    //intMax
    public int intMax(int a, int b, int c) {
        return Math.max(Math.max(a,b),c);
    }
    //close10
    public int close10(int a, int b) {
        int aa= Math.abs(a-10);
        int bb= Math.abs(b-10);
        if (aa<bb) {
            return a;
        }else if (bb<aa) {
            return b;
        }
        return 0;
    }

    //in3050
    public boolean in3050(int a, int b) {
        if (a>=30 && b>=30 && a<=40 && b<=40){
            return true;
        } else if (a>=40 && b>=40 && a<=50 && b<=50) {
            return true;
        }
        return false;
    }

    //max1020
    public int max1020(int a, int b) {
        if ((a>=10 && a<=20) && ( b>=10 && b<=20)){
            return Math.max(a,b);
        }
        else if(a>=10 && a<=20){
            return a;
        } else if  ( b>=10 && b<=20) {
            return b;
        }
        return 0;
    }
    //stringE
    public boolean stringE(String str) {
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='e') {
                count++;
            }
        }
        if (count>0 && count<4)
        {
            return true;
        }
        return false;
    }

    //lastDigit
    public boolean lastDigit(int a, int b) {
        String aa= Integer.toString(a);
        String bb= Integer.toString(b);
        if (aa.charAt(aa.length()-1)==bb.charAt(bb.length()-1)) {
            return true;
        }
        return false;
    }
    //endUp
    public String endUp(String str) {
        if (str.length()>=3) {
            return str.substring(0,str.length()-3) +str.substring(str.length()-3,str.length()).toUpperCase();
        }
        return str.toUpperCase();
    }

    //everyNth
    public String everyNth(String str, int n) {
        String ss="";
        for (int i = 0; i < str.length(); i++) {
            if (i%n==0)
                ss= ss+str.charAt(i);
        }
        return ss;
    }


*/