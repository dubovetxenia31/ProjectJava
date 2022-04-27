package Lesson5Metod;

public class main3 {
    public static void main(String[] args) {
        int[][]numbers1 = {{1,2,5},
                          {4,6,8},
                          {6,3,7}};
        int[][]numbers2 = {{15,23,45,45},
                           {46,65,48,45},
                           {65,36,77,45}};
//        MassiveUtils.printMassiveToConsole(numbers1);
//        MassiveUtils.printMassiveToConsole(numbers2);

       int count1 = MassiveUtils.countGlassFromMassive(numbers2);
        System.out.println(count1);

        int count2 = MassiveUtils.countGlassFromMassive(numbers1);
        System.out.println(count2);
    }
}
