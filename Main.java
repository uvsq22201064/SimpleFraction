public class Main{
    private static final Fraction ZERO = new Fraction(0,1);
    private static final Fraction UN = new Fraction(1,1);
    public static void main(String[] args) {
        Number aNumber = java.math.BigDecimal.ONE;
        Number anotherNumber = new Fraction(1, 2);
        assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;
    }
}