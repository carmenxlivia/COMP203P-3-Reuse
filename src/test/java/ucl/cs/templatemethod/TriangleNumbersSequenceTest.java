package ucl.cs.templatemethod;

import org.junit.Test;
import ucl.cs.matchers.IterableBeginsWith;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;

public class TriangleNumbersSequenceTest {

  final NumberSequence sequence = new TriangleNumbersSequence();

  @Test
  public void definesFirstTermToBeOne() {

    assertThat(sequence.term(0), is(1));

  }

  @Test
  public void definesSubsequentTermsToBeTheSumOfZeroToNPLusOne() {

    assertThat(sequence.term(1), is(3));
    assertThat(sequence.term(2), is(6));
    assertThat(sequence.term(3), is(10));

  }



}