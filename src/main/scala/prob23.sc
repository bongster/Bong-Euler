package main.scala

object prob23 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def divisors(n: Int, d: Int = 2, r: List[Int] = Nil): List[Int] =
    if (n < d) r
    else if (n % d == 0)
      divisors(n / d, d, r :+ d)
    else
      divisors(n, d + 1, r)                       //> divisors: (n: Int, d: Int, r: List[Int])List[Int]

  def divisorsOfSum(n: Int) = {
    def divisors(n: Int, d: Int = 2, r: List[Int] = Nil): List[Int] =
      if (n < d) r
      else if (n % d == 0)
        divisors(n / d, d, r :+ d)
      else
        divisors(n, d + 1, r)

    divisors(n).groupBy(w => w)
    					.mapValues(f => f.size).
    					map(a => (0 to a._2).toList
    					.foldLeft(0)((t, y) => t + BigInt(a._1).pow(y).toInt)).reduce((a, b) => a * b) - n
  }                                               //> divisorsOfSum: (n: Int)Int



// find abundant length

	def solve23(n: Int = 2 , l: List[Int] = Nil,c : Int = 0):Int = {
		if(n > 28123) c
		else if(divisorsOfSum(n) > n){
					solve23(n + 1, l :+ n, c + 1)
		}
		else solve23(n + 1 , l , c)
		
	
	}                                         //> solve23: (n: Int, l: List[Int], c: Int)Int
	
	solve23()                                 //> res0: Int = 6965
}