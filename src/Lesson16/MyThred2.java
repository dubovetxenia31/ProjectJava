package Lesson16;

public class MyThred2 implements Runnable{
    @Override
    public void run() {
        for (int i = 10000; i < 10200; i++){
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
