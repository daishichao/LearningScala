package Algorithms.Sort

/**
 * Created by dsczy on 15-9-12.
 */

//BubbleSort: 比较相邻元素，如果逆序就交换
//复杂度：最差：o(n^2) 最好：o(n) 平均： o(n^2)

object BubbleSort {
  def bubbleSort(a: Array[Int]): Unit = {
    for (i <- 0 until a.length - 1) {
      for (j <- 0 until a.length - i) {
        if (a(j) > a(j + 1)) {
          val swap = a(j)
          a(j) = a(j + 1)
          a(j + 1) = swap
        }
      }
    }
  }
}
