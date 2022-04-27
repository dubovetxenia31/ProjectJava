package Lesson4;


public class Main1 {
    public static void main(String[] args) {
        String email = "dubovetxenia31@gmail.com";
        String[] partsOfEmail = email.split("@");
        if (partsOfEmail.length != 2){
            System.out.println("фвы использовали более одной собаки либо ее вообше нет");
            return;
        }

        if (email.startsWith(".") || email.endsWith(".")){

        }


    }
}
