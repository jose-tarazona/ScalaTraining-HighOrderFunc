package Sums

class Summation {

  def factorial(a: Int):Int = {
    def loop(n: Int, acc: Int): Int = {
      if (n > a) acc
      else loop(n + 1, n * acc)
    }
    loop(1, 1)
  }

  //Excercise
  def summation(f: Int => Int, a: Int, b: Int):Int = ???
}
