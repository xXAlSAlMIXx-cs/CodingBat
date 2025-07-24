public class monkeyTrouble {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        monkeyTrouble mm = new monkeyTrouble();
        System.out.println(mm.monkeyTrouble(true, true)); // true
        System.out.println(mm.monkeyTrouble(false, false)); // true
        System.out.println(mm.monkeyTrouble(true, false)); // false
        System.out.println(mm.monkeyTrouble(false, true)); // false
    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile==bSmile);
    }
}