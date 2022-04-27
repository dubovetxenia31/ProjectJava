package Lesson3;

public class Main6 {
    public static void main(String[] args) {
        String name= "Alexandr";

        char[] simbols= name.toCharArray();
       for (int i=0; i< simbols.length; i++){
           if (simbols[i]=='a' || simbols[i]=='A' || simbols[i] =='e'){
               System.out.println(simbols[i]);
           }
       }

    }
}
