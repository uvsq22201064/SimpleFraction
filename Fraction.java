public class Fraction{
    private int numerateur;
    private int denominateur;
    
    Fraction(int numerateur, int denominateur){
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }
    

    Fraction(int numerateur){
        this.numerateur = numerateur;
        this.denominateur = 1;
    }

    Fraction(){
        this.numerateur = 0;
        this.denominateur = 1;
    }

    public String toString(){
        return "Numérateur : "+this.numerateur+" Dénominateur :"+this.denominateur;
    }

    public int getNumerateur(){
        return this.numerateur;
    }

    public int getDenominateur(){
        return this.denominateur;
    }

    public double doubleValue(){
        return this.numerateur/this.denominateur;
    }

    public Fraction add(Fraction f){
        return new Fraction(this.numerateur*f.getDenominateur() + this.denominateur*f.getNumerateur(), this.denominateur * f.getDenominateur());
    }
}
