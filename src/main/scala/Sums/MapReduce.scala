package Sums

class MapReduce {

  //Implementing a more generic method for both sum and product
  def mapReduce(f: Int => Int, map:(Int, Int) => Int, zero: Int)(a: Int, b: Int) = ???

  //Implementing product using mapReduce
  def product(f: Int => Int)( a: Int, b: Int):Int = ???

  //Implementing factorial using product
  def factorial(n: Int): Int = ???

  //Excercise: Implementing summation using mapReduce
  def summation(f: Int => Int)( a: Int, b: Int):Int = ???

}
