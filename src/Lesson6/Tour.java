package Lesson6;

public class Tour {
    // 1 - переменный (поля класса),  характеристики обьекта
    // 2 -
    // 3 - методы (то что умеет делать этот тип)
    private int days;
    private String country;
    private String typeOfHotel;
    private String typeOfVehicle;
    private int cost;
    private int stars;

    public void setDays(int days) {
        this.days = days;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTypeOfHotel(String typeOfHotel) {
        this.typeOfHotel = typeOfHotel;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
