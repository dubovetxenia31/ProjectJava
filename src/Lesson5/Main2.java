package Lesson5;

public class Main2 {
    public static void main(String[] args) {
        boolean[][] schedule = new boolean[7][7];
        ScheduledUtils.reserved(schedule, "лвоыад", 3);
        ScheduledUtils.reserved(schedule, "Вт", 4);
        ScheduledUtils.reserved(schedule, "Ср", 0);
        ScheduledUtils.reserved(schedule, "Ср", 0);
        ScheduledUtils.reserved(schedule, "Пт", 2);


        System.out.println("        пн      Вт      Ср      Чт      Пт      Сб      Вс   ");

        for (int i = 0; i < schedule.length; i++) {
            System.out.print((i + 9) + "-" + (i + 10) + " ");
            for (int j = 0; j < schedule[i].length; j++) {
                if (schedule[i][j]) {
                    System.out.print(" Занято ");
                } else {
                    System.out.print("        ");
                }

            }
            System.out.println();

        }
    }

    //формула создание метода
    // 1 - модификатор доступа(одно из 4 слов)
    /**Peblic - виден внутри всего проекта
     * _______ - вызвать в нутри тякущей папки
     * protected - виден внутри тякущей папки и дочерним классам
     *private - виден только в нутр тякушего класса
     *
     * 2 -  Static (либо есть либо нет)
     * 3 - возврощаемый тип (int / String/ void)
     * 4 - название метода (максимально понятна)
     * 5 - входяшие параметры в скобках через запетую с указанием типа (int a, int b, int c)
     * 6 - тело метода (то что будет происходить при вызове)
     */



}
