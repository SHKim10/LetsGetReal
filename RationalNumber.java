public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    if (deno == 0){
      numerator = 0;
      denominator = 1;
    }
    else {
      numerator = nume;
      denominator = deno;
    }
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
    return numerator + "/" + denominator;
  }

  private static int gcd(int a, int b){
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
  
}
