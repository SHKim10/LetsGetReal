public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  public boolean equals(RealNumber other){
    if (getValue() == 0 || other.getValue() == 0){
      if (getValue() == 0 && other.getValue() == 0) return true;
      else return false;
    }
    else return Math.abs(getValue() - other.getValue()) <= 1e-5 *
                Math.abs(other.getValue());
  }

  public RealNumber add(RealNumber other){
    RealNumber sum = new RealNumber(getValue() + other.getValue());
    return sum;
  }

  public RealNumber multiply(RealNumber other){
    RealNumber product = new RealNumber(getValue() * other.getValue());
    return product;
  }

  public RealNumber divide(RealNumber other){
    RealNumber quotient = new RealNumber(getValue() / other.getValue());
    return quotient;
  }

  public RealNumber subtract(RealNumber other){
    RealNumber difference = new RealNumber(getValue() - other.getValue());
    return difference;
  }
}
