package prob_2

import scala.collection.mutable.ArrayBuffer

object prob2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	def favinachi(a1: Int,a2:Int, results: ArrayBuffer[Int] = ArrayBuffer(0,1)) : ArrayBuffer[Int] = {
	if(a1 < a2){
	favinachi(results.takeRight(2)(0) + results.takeRight(2)(1), a2, results += results.takeRight(2)(0) + results.takeRight(2)(1))
	}else{
	results.drop(2)
	}
	}                                         //> favinachi: (a1: Int, a2: Int, results: scala.collection.mutable.ArrayBuffer[
                                                  //| Int])scala.collection.mutable.ArrayBuffer[Int]
		
	var results = favinachi(1,4000000).filter(f => f % 2 == 0).sum
                                                  //> results  : Int = 4613732
}