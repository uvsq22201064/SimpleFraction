public class Main{
    private static final Fraction ZERO = new Fraction(0,1);
    private static final Fraction UN = new Fraction(1,1);
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1);
        Fraction a1 = new Fraction(2,3);
        assert f1.compareTo(a1) > 0;
        Fraction f2 = new Fraction(1,4);
        Fraction a2 = new Fraction(5);
        assert f2.compareTo(a2) < 0;
        Fraction f3 = new Fraction(2,4);
        Fraction a3 = new Fraction(6,12);
        assert f3.compareTo(a3) == 0;
    }
}