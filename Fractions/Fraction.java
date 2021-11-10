public class Fraction {
    int numerator;
    int denominator;

    // calling constructor with empty parameters will initialize the fraction to 1/1
    Fraction() {
        setNumerator(1);
        setDenominator(1);
    }

    // calling constructor with two parameters(n and d) will initialize the fraction to n/d
    Fraction(int n, int d) {
        setNumerator(n); // calls the set numerator method and sets numerator to the parameter n
        setDenominator(d); // calls the set denominator method and sets denominator to the parameter d
    }

    // sets the value of "numerator" to the parameter passed
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    // sets the value of "denominator" to the parameter passed
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    // returns the value of "numerator"
    public int getNumerator() {
        return numerator;
    }

    // returns the value of "denominator"
    public int getDenominator() {
        return denominator;
    }

    // greatest common divisor: returns the common number that each denominator can be divided by (ex. a=3 b=9 gcd=3 -- a=4 b=7 gcd=1 (no common divisors))
    int gcd(int a, int b) {
        if (b == 0)
            return (a);
        else
            return (gcd(b, a % b));
    }
    
    // returns a fraction object as a string
    public String toString() {
        String n = String.valueOf(getNumerator());
        String d = String.valueOf(getDenominator());
        String theFraction = n + "/"  + d;
        return theFraction;
    }

    // returns a fraction object as a decimal
    String toDecimal() {
        double n = getNumerator();
        double d = getDenominator();
        double decimalValue = n/d;
        return String.valueOf(decimalValue);
    }

    Fraction add(Fraction f) {
        int n1 = numerator;
        int d1 = denominator;
        int n2 = f.getNumerator();
        int d2 = f.getDenominator();
        int finalDenom1 = 0;
        int finalNumerator1 = 0;
        int finalNumerator2 = 0;
        int sum = 0;
        int gcd = gcd(d1,d2);

        // below simplifies the fractions by getting their gcd and dividing the necessary terms within the fraction
        if (d1 != gcd && d2 != gcd){ // both need to be simplified
            n1 /= gcd;
            n2 /= gcd;
            d1 /= gcd;
            d2 /= gcd;
        } else if (d1 == gcd && d2 != gcd){ // only one fraction needs to be simplified notably n2 and d2
            n2 /= gcd;
            d2 /= gcd;
        } else if (d1 != gcd && d2 == gcd){ // only one fraction need to be simplified notably n1 and d1
            n1 /= gcd;
            d1 /= gcd;
        }
        // makes denominators the same and adjusts the numerators accordingly so they can be added
        if (d1 != d2){
            finalDenom1 = d1 * d2;
            finalNumerator1 = n1 * d2;
            finalNumerator2 = n2 * d1;
        }
        sum = finalNumerator1 + finalNumerator2;
        Fraction finalFraction = new Fraction(sum,finalDenom1);

        return finalFraction;
    }

}
