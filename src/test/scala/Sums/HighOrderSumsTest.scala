package Sums

import org.junit.{Assert, Test}

/**
  * Created by vpctraining on 23/07/17.
  */
class HighOrderSumsTest {

  var sums = new HighOrderSums()
  @Test
  def sumIntTest = {
    val result = sums.sum(x => x, 1, 4)
    Assert.assertEquals(10, result)

  }

  @Test
  def sumeCubesTest = {
    val result = sums.sum(x => x*x*x, 1, 3)
    Assert.assertEquals(36, result)
  }

  @Test
  def factorialTest = {
    val result = sums.factorial(9)
    Assert.assertEquals(362880, result, 0)

  }

  @Test
  def sumFactorialTest = {
    val result = sums.sumFactorial(sums.factorial, 1, 3)
    Assert.assertEquals(9, result)

  }
}
