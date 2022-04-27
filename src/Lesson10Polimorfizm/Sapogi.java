package Lesson10Polimorfizm;

public class Sapogi extends Obuv implements ObuvForFix{
    private String kindIfMaterial;
    private int condition;
    private String sole;

    public void pochinit(){
        System.out.println("Чиним САПОГИ!!!");
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
