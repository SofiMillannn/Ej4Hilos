//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread hiloA = new Relevo("A");
        Thread hiloB = new Relevo("B");
        Thread hiloC = new Relevo("C");
        Thread hiloD = new Relevo("D");

        try {
            hiloA.join();
            hiloB.join();
            hiloC.join();
            hiloD.join();
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido " + e.getMessage());
        }
        System.out.println("La carrera acabo");
    }
}