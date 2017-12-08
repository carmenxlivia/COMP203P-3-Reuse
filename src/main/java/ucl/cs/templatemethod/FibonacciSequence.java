package ucl.cs.templatemethod;

import java.util.Iterator;

public class FibonacciSequence extends NumberSequence {



  protected int positiveTerm(int i) {
    if (i < 2) {
      return 1;
    }
    return term(i - 1) + term(i - 2);
  }


}
