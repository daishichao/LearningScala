package Algorithms.Base

/**
 * Created by dsczy on 15-9-12.
 */

//Fib(n): 0 1 1 2 3 5 8 ...

object Fib {
  def fib1(n: Int): Int = {
    if(n <= 1) n
    else fib1(n - 1) + fib1(n - 2)
  }

  def fib2(n: Int): Int = {
    def Loop(n: Int, i: Int, j: Int): Int =
      if(n <= 1) j
      else Loop(n - 1, j, i + j)
      Loop(n, 0, 1)
  }

  def main(args: Array[String]): Unit ={
    val example1 = fib1(5)
    println(example1)
    val example2 = fib2(5)
    println(example2)
  }
}
