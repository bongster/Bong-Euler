package problem

import scala.annotation.tailrec

object ex14 {
  println("find max path 우박수 under 1000000")      //> find max path 우박수 under 1000000
 
 
	def from(n: Int): Stream[Int] = n #:: from(n + 1)
                                                  //> from: (n: Int)Stream[Int]
	
	
	(1 to 1000000).foldLeft(0)((a, b) => a + b)
                                                  //> res0: Int = 1784293664
	
 from(1) take 5  foreach println                  //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
		
}