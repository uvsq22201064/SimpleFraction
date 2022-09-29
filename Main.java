public class Main{
    private static final Fraction ZERO = new Fraction(0,1);
    private static final Fraction UN = new Fraction(1,1);
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1);
        Fraction a1 = new Fraction(2,3);
        assert !(f1.equals(a1));
        assert (f1.add(a1)).equals(new Fraction(5,3));
        Fraction f2 = new Fraction(5);
        Fraction a2 = new Fraction(1,4);
        assert !(f2.equals(a2));
        assert f2.add(a2).equals(new Fraction(21,4));
        Fraction f3 = new Fraction(2,4);
        Fraction a3 = new Fraction(3,5);
        assert !(f3.equals(a3));
        assert f3.add(a3).equals(new Fraction(22,20));
        assert f3.add(a3).equals(new Fraction(11,10));
    }
}