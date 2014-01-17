package problem

import scala.annotation.tailrec

object Test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val a = List(1, 2, 3, 4, 5)                     //> a  : List[Int] = List(1, 2, 3, 4, 5)

  a.foldLeft(0)((c, o) => c + o)                  //> res0: Int = 15
 
  def checkSig(signum: Int) = if (signum > 0) 1 else if (signum < 0) -1 else 0
                                                  //> checkSig: (signum: Int)Int

  checkSig(-2)                                    //> res1: Int = -1
  checkSig(0)                                     //> res2: Int = 0
  checkSig(3)                                     //> res3: Int = 1
  val bless = {}                                  //> bless  : Unit = ()

  var y = 1                                       //> y  : Int = 1
  var x = {}                                      //> x  : Unit = ()

  x = y = 1

  for (i <- 0 to 10) println(i)                   //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10
  def countdown(n: Int): Unit = for (i <- 0 to n) println(i)
                                                  //> countdown: (n: Int)Unit
  countdown(5)                                    //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5

  "Hello".foldLeft(1L)(_ * _.toLong)              //> res4: Long = 9415087488


  def StrToUnit(s: String): Long = {
    var r: Long = 1L
    for (c <- s) r = r * c.toInt
    r
  }                                               //> StrToUnit: (s: String)Long
  val su: Long = StrToUnit("Hello")               //> su  : Long = 9415087488

  "Hello".takeRight("Hello".length - 1)           //> res5: String = ello

  def product(s: String, result: Long = 1L): Long = {
    if (s.length > 0) product(s.tail, result * s.head.toInt) else result
  }                                               //> product: (s: String, result: Long)Long

  product("Hello")                                //> res6: Long = 9415087488
  
  
}