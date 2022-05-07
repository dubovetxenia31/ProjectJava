package Lesson18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main2 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("state.bin"));
            out.writeObject("text...");
            out.writeDouble(34.5954);
            out.writeObject(new Point(3,6));
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
