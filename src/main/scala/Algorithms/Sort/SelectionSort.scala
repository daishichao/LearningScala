package Algorithms.Sort

/**
 * Created by dsczy on 15-9-12.
 */
//SelectionSort: left -> right => min
//复杂度：最差：o(n^2) 最好：o(n^2) 平均： o(n^2)

object SelectionSort {
  def selectionSort(a: Array[Int]): Unit ={
    for(i <- 0 until a.length - 1){
      var min = i
      for(j <- i + 1 until a.length){
        if(a(j) < a(min)) min = j
      }
      if(min != i){
        val swap = a(i)
        a(i) = a(min)
        a(min) = swap
      }
    }
  }
}
