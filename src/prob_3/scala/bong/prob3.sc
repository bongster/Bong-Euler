package prob_3.scala.bong

import scala.math.BigInt

object prob3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def from(n: Long): Stream[Long] = n #::from(n + 1)
                                                  //> from: (n: Long)Stream[Long]
  
  from(1) take 5 foreach println                  //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  
 	//from(2L) take 600851475143L
	
	def FactorMax(from: Long, until: Long, result: Long = 0): Long = {
		def isFactor(n: Long): Boolean = List(n).exists(p => !(2L until p).exists(a => p % a == 0))
		if(from < until) 	{
			if(isFactor(from))
				if(result < from){
				FactorMax(from + 1 , until, from)
				}else{
					FactorMax(from + 1 , until, result)
				}
			else{
			 FactorMax(from +1 , until, result)
			}
		}
		else{
			result
		}
	}                                         //> FactorMax: (from: Long, until: Long, result: Long)Long
	def Factor(from: Long, until: Long,results: List[Long] = List()): List[Long] = {
		def isFactor(n: Long): Boolean = List(n).exists(p => !(2L until p).exists(a => p % a == 0))
  
		if(from < until) 	{
			if(isFactor(from))
				Factor(from + 1 , until, results :+ from)
			else
			 Factor(from +1 , until, results)
		}
		else{
			results
		}
	}                                         //> Factor: (from: Long, until: Long, results: List[Long])List[Long]\
	FactorMax(1,600851475143L)
	//List(6).exists(p => {println(p);!(2 until p).exists(a => {println(a);p % a == 0})})
	//(2 until 10).exist(a => a % 2 == 0)
	//def isFactor(n: Long): Boolean = (2 until n).exist(
	//600851475143L
}