package Lesson16;

public class Pevets1 extends Thread{
    private boolean needStop = false;

    @Override
    public void run() {
        int count = 0;
        while (!needStop){
            count++;
            if (count > 3){
                needStop = true;
            }


            for (int i = 0; i < 3; i++){
                System.out.println("LA ________");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Monitors.MIKROFON){
                Monitors.MIKROFON.notify();
            }

            synchronized (Monitors.MIKROFON){
                try {
                    Monitors.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
