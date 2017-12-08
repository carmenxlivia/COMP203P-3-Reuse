package ucl.cs.strategy;

import org.junit.Test;
import ucl.cs.matchers.IterableBeginsWith;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;

public class TriangleTermGeneratorTest {

  final TermGenerator termGen = new TriangleNumbersTermGenerator();

  @Test
  public void definesFirstTermToBeOne() {

    assertThat(termGen.positiveTerm(0), is(1));

  }

  @Test
  public void definesSubsequentTermsToBeTheSumOfZeroToNPLusOne() {

    assertThat(termGen.positiveTerm(1), is(3));
    assertThat(termGen.positiveTerm(2), is(6));
    assertThat(termGen.positiveTerm(3), is(10));

  }

}