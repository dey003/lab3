import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3, 4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 4, 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { 1, 2 };
    assertArrayEquals(new int[]{ 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {1, 1, 2, 2, 2};
    assertEquals(2, ArrayExamples.averageWithoutLowest(input1), 0.00001);
  }
}
