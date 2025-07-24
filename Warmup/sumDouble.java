public class sumDouble {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        sumDouble mm = new sumDouble();
        System.out.println(mm.sumDouble(1, 2)); // 3
        System.out.println(mm.sumDouble(3, 4)); // 7
        System.out.println(mm.sumDouble(2, 2)); // 8
    }

    public int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        }else {
            return 2*(a + b);
        }
    }
}
