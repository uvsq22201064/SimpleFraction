public class Main{
    private static final Fraction ZERO = new Fraction(0,1);
    private static final Fraction UN = new Fraction(1,1);
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        assert f1.doubleValue() == 1.0;
        Fraction f2 = new Fraction(5);
        assert f2.doubleValue() == 5.0;
        Fraction f3 = new Fraction(2,4);
        assert f3.doubleValue() == 2/4;
    }
}