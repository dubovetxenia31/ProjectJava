package Lessson7;

public class Treugolnik {
    private int a;
    private int b;
    private int c;

    public void initSides(int a, int b, int c) throws IncorrectStoronaException {
        // -9
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IncorrectStoronaException("a <= 0 || b <= 0 || c <= 0");
        }

        if (b + c <= a) {
            throw new IncorrectStoronaException("Слишком длинная сторона A");
        }
        if (a + b <= c) {
            throw new IncorrectStoronaException("Слишком длинная сторона C");
        }
        if (a + c <= b) {
            throw new IncorrectStoronaException("Слишком длинная сторона B");
        }

        this.a = a;
        this.b = b;
        this.c = c;

    }
}
