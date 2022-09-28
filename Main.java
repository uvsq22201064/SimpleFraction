public class Main{
    private static final Fraction ZERO = new Fraction(0,1);
    private static final Fraction UN = new Fraction(1,1);
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        assert f1.toString().equals("Numérateur : 1 Dénominateur : 1");
        Fraction f2 = new Fraction(5);
        assert f2.toString().equals("Numérateur : 5 Dénominateur : 1");
        Fraction f3 = new Fraction(2,4);
        assert f3.toString().equals("Numérateur : 2 Dénominateur : 4");
    }
}