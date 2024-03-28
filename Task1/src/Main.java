//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Thread t1 = new Thread(new MyRunnable("첫 번째"));
        Thread t2 = new Thread(new MyRunnable("두 번째"));

        t1.start();
        t2.start();
    }
}
