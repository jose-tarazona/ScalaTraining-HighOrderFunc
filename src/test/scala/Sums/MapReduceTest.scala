package Sums

import org.junit.{Assert, Test}

class MapReduceTest {

  var sums = new MapReduce()

  @Test
  def factorialTest = {
    val result = sums.factorial(9)
    Assert.assertEquals(362880, result, 0)

  }

  @Test
  def sumationTest = {
    val result = sums.summation(x => x)( 1, 4)
    Assert.assertEquals(10, result)
  }

  @Test
  def productTest = {
    val result = sums.product(x => x)( 1, 4)
    Assert.assertEquals(10, result)
  }
}
