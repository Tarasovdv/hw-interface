package threads.hw;

public class PrintName extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(4999);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(" Person: ");
        }
    }
}
