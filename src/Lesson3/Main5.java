package Lesson3;

public class Main5 {
    public static void main(String[] args) throws InterruptedException {
        for (int day = 0; day < 365; day++) {
            for (int hour = 0; hour < 24; hour++) {
                for (int minut = 0; minut < 60; minut++) {
                    for (int second = 0; second < 60; second++) {
                        System.out.printf("Со старта прошло : %d дня,  %d  часа,  %d минут,  %d секунд.\n",day,hour,minut,second);
                        Thread.sleep(1000);
                    }
                }
            }
        }
    }
}
