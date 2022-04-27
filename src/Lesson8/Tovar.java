package Lesson8;

public class Tovar {
    private int article;
    private String name;
    private int price;
    private Otziv[] otzivs = new Otziv[100];

    public Tovar() {

    }

    public Tovar(int article, String name, int price) {
        this.article = article;
        this.name = name;
        this.price = price;
    }

    public void addOtziv(Otziv otziv) {
        for (int i = 0; i < otzivs.length; i++) {
            if (otzivs[i] == null) {
                otzivs[i] = otziv;
                break;
            }
        }
    }

    public int countOtziv() {
        int count = 0;
        for (int i = 0; i < otzivs.length; i++) {
            if (otzivs[i] != null) {
                count++;
            }
        }
        return count;
    }

    public double reytingTovar() {
        int summReitingOllOtziv = 0;
        for (int i = 0; i < otzivs.length; i++) {
            if (otzivs[i] != null) {
                summReitingOllOtziv += otzivs[i].summRating();
            }
        }
        return summReitingOllOtziv / (double) (countOtziv()*3);
    }


}
