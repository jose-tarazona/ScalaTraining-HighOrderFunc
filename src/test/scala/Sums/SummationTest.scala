package Sums

import org.junit.{Assert, Test}

class SummationTest {

  var sums = new Summation()

  @Test
  def sumationTest = {
    val result = sums.summation(x => x, 1, 4)
    Assert.assertEquals(10, result)
  }
}
