package Sums

import org.junit.{Assert, Test}

class SimpleSumsTest {
  var sums = new SimpleSums()

  @Test
  def sumIntTest = {
    val result = sums.sumInts(1, 4)
    Assert.assertEquals(10, result)
  }

  @Test
  def sumeCubesTest = {
    val result = sums.sumCubes(1, 3)
    Assert.assertEquals(36, result)
  }

  @Test
  def integralTest = {
    val inc = .1d
    val result = sums.integral(x => inc*x*x, 3, 11, inc)
    Assert.assertEquals(434.67, result, 7)

  }
}
