package Lesson6;

public class ToursUtils {

    public static void prntToursByCounty(String[][] tours, String country) {
        for (int i = 0; i < tours.length; i++) {
            if (country.equals(tours[i][0])) {
                System.out.printf("%s, %s дней, %s руб., %s, %s, %s\n",
                        tours[i][0], tours[i][1], tours[i][2],
                        tours[i][3], tours[i][4], tours[i][5]);
            }
        }
    }

    public static void printToursByDays(String[][] tours, String days) {
        int daysTrip = Integer.parseInt(days);
        for (int i = 0; i < tours.length; i++) {
            int daysCurentTrip = Integer.parseInt(tours[i][1]);
            if (daysCurentTrip >= daysTrip - 2 && daysCurentTrip <= daysTrip + 2) {
                System.out.printf("%s, %s дней, %s руб., %s, %s, %s\n",
                        tours[i][0], tours[i][1], tours[i][2],
                        tours[i][3], tours[i][4], tours[i][5]);
            }
        }
    }

    //средняя стоимость тура
    public static int averageCostTourByCountry(String[][] tours, String country) {
        int costAllTripsByCountry = 0;
        int countTripByCountry = 0;

        for (int i = 0; i< tours.length; i++){
            if (country.equals(tours[i][0])){
                int currentTripCost =  Integer.parseInt(tours[i][2]);
                costAllTripsByCountry += currentTripCost;
               countTripByCountry++;
            }

        }
        return costAllTripsByCountry/countTripByCountry;
    }


}
