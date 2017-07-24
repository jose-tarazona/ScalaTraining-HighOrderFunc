package Sums

class SimpleSums {

  def sumValues(a: Int, b: Int) = a+b

  //sumInts: Σa = a + (a + 1) + (a + 2) + ... (b)
  def sumInts(a: Int, b: Int): Int = {
    if(a > b) 0
    else a + sumInts(a + 1, b)
  }

  //sumInts: Σa³ = a³ + (a + 1)³ + (a + 2)³ + ... (b³)
  def sumCubes(a: Int, b: Int): Int = {
    if(a > b) 0
    else a*a*a + sumCubes(a + 1, b)
  }

  //Exercise integral: Σf(a)
  def integral(f: Double => Double, a: Double, b: Double, inc: Double):Double = ???
}
