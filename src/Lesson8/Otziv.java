package Lesson8;

public class Otziv {
    private User user;
    private int udobstvo;
    private int prostota;
    private int ves;

    public Otziv(String lera, int udobstvo, int prostota, int ves){

    }

    public Otziv(User user, int udobstvo, int prostota, int ves) {
        this.user = user;
        this.udobstvo = udobstvo;
        this.prostota = prostota;
        this.ves = ves;
    }

    public int summRating(){
        return udobstvo + prostota + ves;
    }




    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getUdobstvo() {
        return udobstvo;
    }

    public void setUdobstvo(int udobstvo) {
        this.udobstvo = udobstvo;
    }

    public int getProstota() {
        return prostota;
    }

    public void setProstota(int prostota) {
        this.prostota = prostota;
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        this.ves = ves;
    }
}
