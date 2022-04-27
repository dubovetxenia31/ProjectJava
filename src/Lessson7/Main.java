package Lessson7;

public class Main {
    public static void main(String[] args) {
        Treugolnik treugolnik = new Treugolnik();
        try {
            treugolnik.initSides(3,5,10);
        } catch (IncorrectStoronaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("OK");
    }
}
