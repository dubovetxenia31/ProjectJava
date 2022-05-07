package Lesson18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main3 {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("state.bin"));
            String st = (String) in.readObject();
            double number = in.readDouble();
            Point point = (Point) in.readObject();

            System.out.println(st);
            System.out.println(number);
            System.out.println(point);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
