package Algorithms.Base

/**
 * Created by dsczy on 15-9-12.
 */

// 最大公约数： 取余
// 最小公倍数： 两整数的乘积 / 最大公约数

object Gcd {
  def gcd(m: Int, n: Int): Int = {
    if (n == 0) m
    else gcd(n, m % n)
  }

  def lxm(m: Int, n: Int): Int = {
    if(n == 0) m
    else m * n / gcd(m, n)
  }



  def main(args: Array[String]): Unit = {
    val example1 = gcd(60, 24)
    println(example1)
    val example2 = lxm(60, 24)
    println(example2)
  }
}


