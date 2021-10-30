public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    public Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {

        return numerator;
    }

    public int getDenominator() {

        return denominator;
    }

    public double toDecimal() {

        return (double) numerator/ (double) denominator;
    }

    public String print() {
        return String.format("%d / %d", numerator, denominator);
    }

    public Bruch multiplicate(Bruch b2) {
        int newNumerator = b2.getNumerator()*numerator;
        int newDenominator = b2.getDenominator()*denominator;

        return new Bruch (newNumerator, newDenominator);
    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {

        return multiplicate(b2.multiplicate(b3));

    }

}
