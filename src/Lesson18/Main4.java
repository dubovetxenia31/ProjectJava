package Lesson18;

import java.io.File;
import java.io.FileFilter;

public class Main4 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\sadmin\\Downloads");
        File[] filesFromDownloads =  dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()){
                    return true;
                }
                if (pathname.getName().endsWith(".png") ||
                       pathname.getName().endsWith(".jpeg") ||
                       pathname.getName().endsWith(".jpg") ||
                       pathname.getName().endsWith(".swg")){
                    return true;
                }
                return false;
            }
        });
        for (File f:filesFromDownloads){
            System.out.println(f.getAbsolutePath());
        }


    }
}
