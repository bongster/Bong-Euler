package main.scala

object prob28 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def solve28(n : Int): Int ={
  
   def getN(n : Int): Int = ((n + 1) / 2 -1 ) * 2
  	if(n == 1) 1
  	else {
 			val r = (0 until 4).map(n * n - getN(n) * _).sum
 			r + solve28(n - 2)
  	}
  	}                                         //> solve28: (n: Int)Int
  
  
  solve28(1001)                                   //> res0: Int = 669171001
  
// 	(1 until 4).map(x => 2*n * x)
  
  (1 until 4).map(BigInt(_))                      //> res1: scala.collection.immutable.IndexedSeq[scala.math.BigInt] = Vector(1, 2
                                                  //| , 3)
   BigInt(1) - BigInt(3)                          //> res2: scala.math.BigInt = -2
   
   
   
   val n = 5                                      //> n  : Int = 5
}