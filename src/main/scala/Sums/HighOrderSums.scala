package Sums

class HighOrderSums {

  //sum: Generic Σ implementation
  def sum(f: Int => Int, a: Int, b: Int): Int = {
    if(a > b) 0
    else f(a) + sum(f, a + 1, b)
  }

  //factorial
  def factorial(a: Int):Int = {
    if(a == 0)  1
    else a * factorial(a - 1)
  }


  //Excercise: Implement sumFactorial using sum
  def sumFactorial(f: Int => Int, a: Int, b: Int): Int = ???
}
