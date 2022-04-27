package Lesson13;

import java.util.Objects;

public class Coin implements Comparable<Coin> {
    private int nominal;
    private double diametr;
    private String metal;
    private int year;


    public Coin() {
    }

    public Coin(int nominal, double diametr, String metal, int year) {
        this.nominal = nominal;
        this.diametr = diametr;
        this.metal = metal;
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal =" + nominal +
                ", diametr =" + diametr +
                ", metal ='" + metal + '\'' +
                ", year =" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return nominal == coin.nominal && Double.compare(coin.diametr, diametr) == 0 && year == coin.year && Objects.equals(metal, coin.metal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, diametr, metal, year);
    }

    @Override
    public int compareTo(Coin o) {
        if (this.getYear() != o.getYear()) {
            return this.getYear() - o.getYear();
        }
        if (this.getNominal() != o.getNominal()){
            return this.getNominal() - o.getNominal();
        }
        if(this.getDiametr() != o.getDiametr()) {
            return Double.compare(this.getDiametr(), o.getDiametr());
        }

        return this.getMetal().compareTo(o.getMetal());
    }
}
