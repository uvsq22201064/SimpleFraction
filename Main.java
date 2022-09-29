public class Main{
    private static final Fraction ZERO = new Fraction(0,1);
    private static final Fraction UN = new Fraction(1,1);
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction a1 = new Fraction(2,3);
        assert f1.add(a1).getNumerateur() == 5;
        assert f1.add(a1).getDenominateur() == 3;
        Fraction f2 = new Fraction(5);
        Fraction a2 = new Fraction(1,4);
        assert f1.add(a1).getNumerateur() == 5;
        assert f1.add(a1).getDenominateur() == 4;
        Fraction f3 = new Fraction(2,4);
        Fraction a3 = new Fraction(3,5);
        assert f1.add(a1).getNumerateur() == 11;
        assert f1.add(a1).getDenominateur() == 10;
    }
}