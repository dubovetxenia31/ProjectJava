package Lesson8;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Lera");
        User user2 = new User("Slavik");
        User user3 = new User("Vasya");

        Otziv otziv1 = new Otziv(user1,4,5,3);
        Otziv otziv2 = new Otziv(user2,3,4,4);
        Otziv otziv3 = new Otziv(user3,1,2,5);

        Tovar tovar1 = new Tovar(567432, "ДоброСад DS01",4399);
        tovar1.addOtziv(otziv2);
        tovar1.addOtziv(otziv1);
        tovar1.addOtziv(otziv3);

        System.out.println(tovar1.reytingTovar());

        System.out.println(user3);


    }
}
