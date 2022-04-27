package HomeWork;

public class Work3 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 6, 2, 8, 4, 9, 6};


//                int summ = 0;
//        //Вывести на консоль сумму четных чисел этого массива
//        for (int i = 0; i < numbers.length; i++) {
//            if (i % 2 == 0) {
//                summ += numbers[i];
//            }
//        }
//        System.out.println(summ);


        //Вывести кого больше в массиве, четных или нечетных?

//        int evenNumbers = 0;
//        int oddNumbers = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0 ) {
//                evenNumbers++;
//            } else
//                oddNumbers++;
//        }
//        if(evenNumbers>oddNumbers){
//            System.out.println("четных чисел больше");
//        }else System.out.println("нечетных больше");


        //Вывести через ячейку

//        for (int i = 0; i <= numbers.length -1; i= i+2){
//            System.out.println(numbers[i]);
//        }


        String name = " Easy Moderator";
// Вывести на консоль только гласные из этого массива
        char[] simbols = name.toCharArray();
        for (int i = 0; i < simbols.length; i++) {
            if (simbols[i] == 'A' || simbols[i] == 'E' || simbols[i] == 'I' || simbols[i] == 'O' || simbols[i] == 'U' || simbols[i] == 'a' || simbols[i] == 'e' || simbols[i] == 'i' || simbols[i] == 'o' || simbols[i] == 'u') {
                System.out.println(simbols[i]);
            }
        }


    }
}



