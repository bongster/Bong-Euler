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
	
	val a = from(1) take 1000                 //> a  : scala.collection.immutable.Stream[Int] = Stream(1, ?)
	
	a.filter(p => (p % 3 == 0)  || (p % 5 ==0)).sum
                                                  //> res1: Int = 234168
   
   2.toBinaryString                               //> res2: String = 10
  ~2                                              //> res3: Int = -3
  //(1 to 1000).filter(p => (p % 3 ==0) || (p % 5 ==0)).sum
                                                  ~7
                                                  //> res4: Int = -8
                                                  
}