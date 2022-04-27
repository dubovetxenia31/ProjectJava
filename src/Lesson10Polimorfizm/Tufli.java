package Lesson10Polimorfizm;

public class Tufli extends Obuv implements ObuvForFix {
    private String kindIfMaterial;
    private int condition;
    private String sole;

    public void pochinit() {
        System.out.println("Чиним Туфли!!!");
    }

    @Override
    public String kindIfMaterial() {
        return null;
    }

    @Override
    public int condition() {
        return 0;
    }

    @Override
    public String sole() {
        return null;
    }
}
