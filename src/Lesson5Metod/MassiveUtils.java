package Lesson5Metod;

public class MassiveUtils {

    /**
     * формула создание метода
     * 1 - модификатор доступа(одно из 4 слов)
     * Public - виден внутри всего проекта
     * _______ - вызвать в нутри тякущей папки
     * protected - виден внутри тякущей папки и дочерним классам
     * private - виден только в нутр тякушего класса
     * <p>
     * 2 -  Static (либо есть либо нет)
     * 3 - возврощаемый тип (int / String/ void(без возврошаемого типа))
     * 4 - название метода (максимально понятна)
     * 5 - входяшие параметры в скобках через запетую с указанием типа (int a, int b, int c)
     * 6 - тело метода (то что будет происходить при вызове)
     */

    //Напичатать массив
    public static void printMassiveToConsole(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int countGlassFromMassive(int[][] mass) {
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

}
