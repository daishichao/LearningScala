package Algorithms.Sort

/**
 * Created by dsczy on 15-9-12.
 */

//QuickSort: left 中 right
//复杂度：最差：o(n^2) 最好：o(nlog(n)) 平均： o(nlog(n))

object QuickSort {
  def quickSort(a: Array[Int]): Unit ={
    def swap(i: Int, j: Int): Unit = {
      val tmp = a(i)
      a(i) = a(j)
      a(j) = tmp
    }

    def sort(l: Int, r: Int): Unit ={
      val p = a((l + r) / 2)
      var i = l
      var j = r
      while(i <= j){
        while(a(i) < p) i += 1
        while(a(i) > p) j -= 1
        if(i < j) {
          swap(i, j)
          i += 1
          j -= 1
        }
      }
      if(l < j) sort(l, j)
      if(j < r) sort(i, r)
    }
    sort(0, a.length - 1)
  }
}
