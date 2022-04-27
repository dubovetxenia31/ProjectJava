package Lesson4;

public class Main {
    public static void main(String[] args) {
        // всегда 2 варианта после равно (new String();)    ("....")
        //проверим на сколько пароль надежный
        String password = "guyfEd7P9eWjdaertd";

        int passwordLength = password.length();
        if (passwordLength < 8) {
            System.out.println("Пароль слишком короткий!!!");
            return;
        }
        if (!password.contains("0") && !password.contains("1")
                && !password.contains("2")
                && !password.contains("3")
                && !password.contains("4")
                && !password.contains("5")
                && !password.contains("6")
                && !password.contains("7")
                && !password.contains("8")
                && !password.contains("9")) {
            System.out.println("В пароле нет цифры!!!");
            return;
        }

        String alfabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        for (int i = 0; i < alfabet.length(); i++) {
            char currentCharFromAlfabet = alfabet.charAt(i);
            if (password.contains(currentCharFromAlfabet + "")) {
                System.out.println("Это большая буква: " + currentCharFromAlfabet);
            }

        }


    }
}
