import java.util.concurrent.Semaphore;

public class Relevos extends Thread{
    public Relevos(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        Semaphore sem = new Semaphore(1);
        if (getName().equals("A")){

            System.out.println("Estoy corriendo :) y soy el hilo " + getName());
            sem.release();
        }else if (getName().equals("B")){
            try {

                sleep(2000);
                sem.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Estoy corriendo :) y soy el hilo " + getName());
            sem.release();

        } else if (getName().equals("C")) {
            try {

                sleep(2000);
                sem.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Estoy corriendo :) y soy el hilo " + getName());
            sem.release();
        } else if (getName().equals("D")) {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Estoy corriendo :) y soy el hilo " + getName());
        }

    }
}
