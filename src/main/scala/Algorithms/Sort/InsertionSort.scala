package Algorithms.Sort

/**
 * Created by dsczy on 15-9-12.
 */
//InsertionSort:
//复杂度：最差：o(n^2) 最好：o(n) 平均： o(n^2)

object InsertionSort {
  def main(a: Array[Int]): Unit ={
    for(i <- 1 until a.length){
      var j = i - 1
      val temp = a(i)
      while(j >= 0 && a(j) > temp){
        a(j + 1) = a(j)
        j -= 1
      }
      a(j + 1) = temp
    }
  }
}
