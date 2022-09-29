public class Fraction extends Number{
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
        return (double) this.numerateur/ (double) this.denominateur;
    }

    public int intValue(){
        return (int) (this.numerateur/this.denominateur);
    }

    public float floatValue(){
        return (float) (this.numerateur/this.denominateur);
    }

    public long longValue(){
        return (long) (this.numerateur/this.denominateur);
    }

    public Fraction add(Fraction f){
        return new Fraction(this.numerateur*f.getDenominateur() + this.denominateur*f.getNumerateur(), this.denominateur * f.getDenominateur());
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Fraction) {
            Fraction o = (Fraction) obj;
            return this.getNumerateur()*o.getDenominateur() == this.getDenominateur()*o.getNumerateur();
        }
        return false;
    }

    public int compareTo(Fraction f) {
        return this.numerateur*f.getDenominateur() - this.denominateur*f.getNumerateur();
    }
    
}
