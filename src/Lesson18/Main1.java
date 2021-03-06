package Lesson18;

import java.io.RandomAccessFile;

public class Main1 {
    public static void main(String[] args) {
        try {
            RandomAccessFile rf = new RandomAccessFile("rtest.dat", "rw");
        // Записать в файл 10 чисел и закрыть файл
            for(int i = 0; i < 10; i++)
                rf.writeDouble(i * 1.414);
            rf.close();
        // Открыть файл, записать в него еще одно число и снова закрыть
            rf = new RandomAccessFile("rtest.dat", "rw");
            //Размер файла = 80 байт
            rf.seek(5 * 8); // отступили 5 чисел
            rf.writeDouble(47.0000001);
            rf.close();
        // Открыть файл с возможностью только чтения "r"
            rf = new RandomAccessFile("rtest.dat", "r");
        // Прочитать 10 чисел и показать их на экране
            for(int i = 0; i < 10; i++)
                System.out.println("Value " + i + ": " + rf.readDouble());
            rf.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
