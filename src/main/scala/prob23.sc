package main.scala

object prob23 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  def fivonacci(n: Int): Int =
  	if(n == 0) n
  	else n + fivonacci(n -1)                  //> fivonacci: (n: Int)Int
  	
  	fivonacci(55)                             //> res0: Int = 1540
  	
  def divisors(n: Int, d:Int = 2,r: List[Int] = Nil): List[Int] =
  		if(n < d) r
  		else if(n % d == 0)
  			divisors(n / d, d, r :+ d)
  		else
  			divisors(n, d + 1, r)     //> divisors: (n: Int, d: Int, r: List[Int])List[Int]
  
  
  def divisorsOfSum(l: List[Int]) = l.groupBy(w => w).mapValues(f => f.size).map(a => (0 to a._2).toList.foldLeft(0)((t,y) => t + BigInt(a._1).pow(y).toInt))
                                                  //> divisorsOfSum: (l: List[Int])scala.collection.immutable.Iterable[Int]
  
  val r = divisors(220)                           //> r  : List[Int] = List(2, 2, 5, 11)
 	
 	BigInt(10).pow(0)                         //> res1: scala.math.BigInt = 1
 	
  divisors(220).groupBy(w => w).mapValues(f => f.size).map(a => (0 to a._2).toList.foldLeft(0)((t,y) => t + BigInt(a._1).pow(y).toInt))
                                                  //> res2: scala.collection.immutable.Iterable[Int] = List(12, 7, 6)
  
}