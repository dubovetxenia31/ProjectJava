package Lesson5;

public class ScheduledUtils {
    public static void reserved (boolean[][] schedule, String day, int time){
        int dayIndex = -1;
        if (day.equals("Пн")){
            dayIndex = 0;
        }
        if (day.equals("Пн")){
            dayIndex = 0;
        }
        if (day.equals("Вт")){
            dayIndex = 1;
        }
        if (day.equals("Ср")){
            dayIndex = 2;
        }
        if (day.equals("Чт")){
            dayIndex = 3;
        }
        if (day.equals("Пт")){
            dayIndex = 4;
        }
        if (day.equals("Сб")){
            dayIndex = 5;
        }
        if (day.equals("Вс")){
            dayIndex = 6;
        }
        if (dayIndex == -1){
            System.out.println("Токого дня не существует");
            return;
        }
        if (schedule[time][dayIndex]== true){
            System.out.println("Время бронирования - ЗАНЯТО!!!");
        }else {
            schedule[time][dayIndex] = true;
            System.out.println("Успешно забронировали");
        }
    }
}
