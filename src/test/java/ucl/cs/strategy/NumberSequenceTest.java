package ucl.cs.strategy;

import org.junit.Test;
import ucl.cs.matchers.IterableBeginsWith;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;

public class NumberSequenceTest {

  final NumberSequence sequence = new NumberSequence(new TermGenerator() {
    @Override
    public int positiveTerm(int i) {
      return i;
    }
  });



  @Test
  public void isUndefinedForNegativeIndices() {

    try {
      sequence.term(-1);
      fail("should have thrown exception");
    } catch (IllegalArgumentException e) {
      assertThat(e.getMessage(), containsString("Not defined for indices < 0"));
    }
  }

  @Test
  public void canBeIteratedThrough() {
    assertThat(sequence, IterableBeginsWith.beginsWith(1, 1, 2, 3, 4));
  }

}