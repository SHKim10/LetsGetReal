public class RationalNumber extends Number {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    if (deno == 0){
      numerator = 0;
      denominator = 1;
    } else if (deno < 0){
      numerator = -nume;
      denominator = -deno;
    } else {
      numerator = nume;
      denominator = deno;
    }
    reduce();
  }

  public double getValue(){
    return (double) numerator / denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    return new RationalNumber(getDenominator(), getNumerator());
  }

  public boolean equals(RationalNumber other){
    return (getNumerator() == other.getNumerator() &&
            getDenominator() == other.getDenominator());
  }

  public String toString(){
    if (denominator == 1){
      return numerator + "";
    } else {
      return numerator + "/" + denominator;
    }
  }

  private static int gcd(int a, int b){
    if (a == 0 || b == 0) return 1;
    a = Math.abs(a);
    b = Math.abs(b);
    if (a < b){
      int c = b;
      b = a;
      a = c;
    }
    int remainder = a % b;
    while (remainder != 0){
      a = b;
      b = remainder;
      remainder = a % b;
    }
    return b;
  }

  private void reduce(){
    int gcd = gcd(numerator, denominator);
    numerator /= gcd;
    denominator /= gcd;
  }

  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(getNumerator() * other.getNumerator(),
                              getDenominator() * other.getDenominator());
  }

  public RationalNumber divide(RationalNumber other){
    return new RationalNumber(getNumerator() * other.getDenominator(),
                              getDenominator() * other.getNumerator());
  }

  public RationalNumber add(RationalNumber other){
    int nume = getNumerator();
    int deno = getDenominator();
    int otherNume = other.getNumerator();
    int otherDeno = other.getDenominator();
    return new RationalNumber(nume * otherDeno + otherNume * deno, deno * otherDeno);
  }

  public RationalNumber subtract(RationalNumber other){
    int nume = getNumerator();
    int deno = getDenominator();
    int otherNume = other.getNumerator();
    int otherDeno = other.getDenominator();
    return new RationalNumber(nume * otherDeno - otherNume * deno, deno * otherDeno);
  }
}
