package Lesson3;

public class Main1 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 77, 3, 8, 6, 8, 56, 9};

        //вывести с конца в начало все ичейки через одну
//        for (int i = numbers.length - 1; i >= 0; i = i - 2) {
//            System.out.println(numbers [i]);
//        }
        //Все нечетные в обратном порядке
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
