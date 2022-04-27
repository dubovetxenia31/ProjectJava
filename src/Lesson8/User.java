package Lesson8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private  String name;
    private Date registerDate;

    public User(){

    }

    public User(String name) {
        this.name = name;
        registerDate = new Date();
    }

    public String dateFormat(){
        SimpleDateFormat dt1 = new SimpleDateFormat("dd/MM/yyyy");
        return dt1.format(registerDate);
    }



    @Override
    public String toString() {
        return "Пользователь: "+name+ ", зарегестрирован " + dateFormat();
    }
}
