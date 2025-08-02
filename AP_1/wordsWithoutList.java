package AP_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class wordsWithoutList {
    public List wordsWithoutList(String[] words, int len) {
        LinkedList<String> nms= new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()!=len){
                nms.add(words[i]);
            }
        }
        return nms;
    }
 
}
