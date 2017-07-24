package Sums

import org.junit.{Assert, Test}

/**
  * Created by vpctraining on 23/07/17.
  */
class SummationTailTest {

  var sums = new SummationTail()

  @Test
  def factorialTest = {
    val result = sums.factorial(9)
    Assert.assertEquals(362880, result, 0)

  }

  @Test
  def sumationIntTest = {
    val result = sums.summation(x => x, 1, 4)
    Assert.assertEquals(10, result)
  }

  @Test
  def sumationCubesTest = {
    val result = sums.summation(x => x*x*x, 1, 3)
    Assert.assertEquals(36, result)
  }

  @Test
  def sumationFactorialTest = {
    val result = sums.summation(sums.factorial, 1, 3)
    Assert.assertEquals(9, result)
  }

  @Test
  def sumationTailIntTest = {
    val result = sums.summation(x => x, 1, 4)
    Assert.assertEquals(10, result)
  }
}
