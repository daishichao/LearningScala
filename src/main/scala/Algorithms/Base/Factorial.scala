package Algorithms.Base

/**
 * Created by dsczy on 15-9-12.
 */

//n! = n * (n - 1)! 5!= 1 * 5 * 4 * 3 * 2 * 1

object Factorial {
  def factorial1(n: Int): Int = {
    if(n == 0) 1
    else n * factorial1(n - 1)
  }

  def factorial2(n: Int): Int = {
    def Loop(n: Int, acc: Int): Int = {
      if(n == 0) acc
      else Loop(n - 1, n * acc )
    }
    Loop(n, 1)
  }

  def factorial3(n: Int): Int = {
    var acc = 1
    var i = n
    while(i > 1) {
      acc *= i
      i -= 1
    }
    acc
  }


  def main(args: Array[String]): Unit ={
    val example1 = factorial1(5)
    println(example1)
    val example2 = factorial2(5)
    println(example2)
    val example3 = factorial1(5)
    println(example3)
  }
}
