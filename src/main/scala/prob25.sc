package main.scala

object prob25 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val l: List[Int] = Nil                          //> l  : List[Int] = List()
  
  
  
  114.toString.length                             //> res0: Int = 3
  
  def fibonacci(l: List[BigInt] = List(1,1)): BigInt = {
  	if(l.last.toString.length == 1000) l.size
  	else fibonacci(l :+ l.takeRight(2).sum)
  }                                               //> fibonacci: (l: List[BigInt])BigInt
  
  fibonacci()                                     //> res1: BigInt = 4782
}