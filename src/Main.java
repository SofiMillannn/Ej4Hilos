//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread hiloA = new Relevos("A");
        Thread hiloB = new Relevos("B");
        Thread hiloC = new Relevos("C");
        Thread hiloD = new Relevos("D");

        try {
            hiloA.join();
            hiloB.join();
            hiloC.join();
            hiloD.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}