package Lesson16;

public class Pevets2 extends Thread{
    @Override
    public void run() {
        while (true){

            synchronized (Monitors.MIKROFON){
                try {
                    Monitors.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }



            for (int i = 0; i < 2; i++){
                System.out.println(" ________Fa");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Monitors.MIKROFON){
                Monitors.MIKROFON.notify();
            }


            }

        }
    }

