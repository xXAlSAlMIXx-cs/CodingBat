import com.sun.tools.javac.Main;
import java.lang.reflect.Array;
import static java.lang.System.in;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class sleepIn {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        sleepIn mm = new sleepIn();
        System.out.println(mm.sleepIn(false, false));
        System.out.println(mm.sleepIn(true, false));
        System.out.println(mm.sleepIn(false, true));
        System.out.println(mm.sleepIn(true, true));



    }
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday==false && vacation==false) {
            return true;
        } else if (weekday == true && vacation== false) {
            return false;
        } else if (weekday == false && vacation== true) {
            return true;
        }else  {
            return true;
        }
    }

}