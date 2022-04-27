package Lesson3;

public class Main3 {
    public static void main(String[] args) {
//положить в массив четные числа начиная от 10
        int[] numbers = new int[7];

//        numbers[0]= 10;
//        numbers[1]= 12;
//        numbers[2]= 14;
//        numbers[3]= 16;
//        numbers[4]= 18;
//        numbers[5]= 20;
//        numbers[6]= 22;

        int value = 10;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = value;
            value = value + 2;
        }
    }
}
