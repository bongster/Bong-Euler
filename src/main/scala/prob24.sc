package main.scala

object prob24 {

  println("hello, World")                         //> hello, World

  def factorial(n: Int): Int =
    if (n == 0) 1
    else n * factorial(n - 1)                     //> factorial: (n: Int)Int
	
	val limit = 1000000                       //> limit  : Int = 1000000
	
	/*
	val aa = "0123456789".permutations.toList.sorted
	aa(999999)
	*/
	

	
	def result(n : Int = 9, limit: Int, r: String = "" ,digits:String = "0123456789"): String =
		if(n < 0 ) r
		else {
			val nn = digits.length()
			val fn = factorial(nn -1)
			val (num , order) = (limit / fn, limit % fn)
//			Console println s"${digits(num)} , ${order}"
			result(n - 1,order , r + digits(num).toString, digits diff digits(num).toString)
		}                                 //> result: (n: Int, limit: Int, r: String, digits: String)String
	
	result(limit = limit -1)                  //> res0: String = 2783915460
}