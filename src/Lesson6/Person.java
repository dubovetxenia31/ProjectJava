package Lesson6;

public class Person {
    //поля класса
    private int age;
    private String name;
    private String surname;
    private int dohod;

    // Конструкторы класса

    public Person(){

    }

    public Person(int age){
        this.age = age;
    }
    public Person(int age,String name, String surname, int dohod){
      this.age = age;
      this.name = name;
      this.surname = surname;
      this.dohod = dohod;
    }


//методы класса
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDohod(int dohod) {
        this.dohod = dohod;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDohod() {
        return dohod;
    }
}
