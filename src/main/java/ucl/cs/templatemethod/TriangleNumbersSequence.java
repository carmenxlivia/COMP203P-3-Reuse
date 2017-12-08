package ucl.cs.templatemethod;

import java.util.Iterator;

public class TriangleNumbersSequence extends NumberSequence {

  @Override
  protected int positiveTerm(int i) {
    return (i+1)*(i+2)/2;
  }

}
