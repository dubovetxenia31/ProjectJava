package Lesson17;


import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CopyWithOneByte oneByte = new CopyWithOneByte();
        long startTime = System.currentTimeMillis();
        try {
            oneByte.copy("C:\\Users\\sadmin\\Pictures\\213189.mp4", "C:\\Users\\sadmin\\Pictures\\213189a.mp4");
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("CopyWithOneByte - " + (endTime - startTime));




        CopyWithFiles withFiles = new CopyWithFiles();
        long startTime1 = System.currentTimeMillis();
        try {
           withFiles.copy("C:\\Users\\sadmin\\Pictures\\213189.mp4", "C:\\Users\\sadmin\\Pictures\\213189b.mp4");
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime1 = System.currentTimeMillis();

        System.out.println("CopyWithFiles - " + (endTime1 - startTime1));




        CopyWithGuava withGuava = new CopyWithGuava();
        long startTime2 = System.currentTimeMillis();
        try {
            withGuava.copy("C:\\Users\\sadmin\\Pictures\\213189.mp4", "C:\\Users\\sadmin\\Pictures\\video2.mp4");
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime2 = System.currentTimeMillis();

        System.out.println("CopyWithGuava - " + (endTime2 - startTime2));
    }
}
