package main.scala

object prob30 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def solve(n: Int): Stream[Int] = if (n == n.toString.map(m => BigInt(m.toString.toInt).pow(5)).sum) n #:: solve(n + 1) else solve(n + 1)
                                                  //> solve: (n: Int)Stream[Int]

  solve(2).take(6) sum                            //> res0: Int = 443839
}