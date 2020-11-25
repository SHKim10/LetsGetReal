public abstract class Number{

  public abstract double getValue();

  public int compareTo(Number other){
    return Double.compare(getValue(). other.getValue());
  }

  public boolean equals(RealNumber other){
    if (getValue() == 0 || other.getValue() == 0){
      if (getValue() == 0 && other.getValue() == 0) return true;
      else return false;
    }
    else return Math.abs(getValue() - other.getValue()) <= 1e-5 *
                Math.abs(other.getValue());
  }

}
