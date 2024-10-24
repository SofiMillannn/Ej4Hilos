import java.util.concurrent.Semaphore;

public class Relevo extends Thread{
    static Semaphore sem = new Semaphore(1); //siempre hacerlo global
    static int contador = 1;
    public Relevo(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        try {
            sem.acquire();
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido " + e.getMessage());
        }
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido " + e.getMessage());
        }
        System.out.println("Paso el testigo");
        contador++;
        if (contador == 5){
            System.out.println("Termine, soy el ultimo");
        }

        sem.release();
    }
}
