package main.scala

object prob21 {

  //  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))

  var a = 0                                       //> a  : Int = 0
  var b = 0                                       //> b  : Int = 0
  
  def CheckAmicableNumber(n: Int, maxNum: Int = 10000): List[Int] = {
    // amicable number ok
    def divisors(n: Int, m: Int = 2, l: List[Int] = Nil): Int = {
      if (l.contains(m) || n <= m) l.sum + 1
      else if (n % m == 0) {
//        println(s"${n}  , ${m} , ${n / m} , ${l}")
        divisors(n, m + 1, l ::: List((n / m), m))
      } else divisors(n, m + 1, l)

    }
    a = divisors(n);
    if (a > maxNum)
      b = 0
    else
      b = divisors(a);
		
		println(s"(${n},${a}) == (${a},${b}) = ${n == b}")
    if (n == b && n != a) List(n, a) else List(n)
  }                                               //> CheckAmicableNumber: (n: Int, maxNum: Int)List[Int]

  def AmicableNumber(EvaluateList: List[Int], count: Int = 0): Int = {
    if (EvaluateList.isEmpty) count
    else {
      val checkList = CheckAmicableNumber(EvaluateList.head)
//			println(checkList toString)
      checkList.length match {
        case 1 => AmicableNumber(EvaluateList diff checkList, count)
        case 2 => AmicableNumber(EvaluateList diff checkList, count + checkList.sum)
      }
    }
  }                                               //> AmicableNumber: (EvaluateList: List[Int], count: Int)Int

  CheckAmicableNumber(11)                         //> (11,1) == (1,1) = false
                                                  //| res0: List[Int] = List(11)
  
  val result = AmicableNumber((2 to 10000) toList)//> (2,1) == (1,1) = false
                                                  //| (3,1) == (1,1) = false
                                                  //| (4,5) == (5,1) = false
                                                  //| (5,1) == (1,1) = false
                                                  //| (6,6) == (6,6) = true
                                                  //| (7,1) == (1,1) = false
                                                  //| (8,7) == (7,1) = false
                                                  //| (9,7) == (7,1) = false
                                                  //| (10,8) == (8,7) = false
                                                  //| (11,1) == (1,1) = false
                                                  //| (12,16) == (16,19) = false
                                                  //| (13,1) == (1,1) = false
                                                  //| (14,10) == (10,8) = false
                                                  //| (15,9) == (9,7) = false
                                                  //| (16,19) == (19,1) = false
                                                  //| (17,1) == (1,1) = false
                                                  //| (18,21) == (21,11) = false
                                                  //| (19,1) == (1,1) = false
                                                  //| (20,22) == (22,14) = false
                                                  //| (21,11) == (11,1) = false
                                                  //| (22,14) == (14,10) = false
                                                  //| (23,1) == (1,1) = false
                                                  //| (24,36) == (36,61) = false
                                                  //| (25,11) == (11,1) = false
                                                  //| (26,16) == (16,19) = false
                                                  //| (27,13) == (13,1) = false
                                                  //| (28,28) == (28,28) = true
                                                  //| (29,1) == (1,1) = false
                                                  //| (30,42) == (42,54) = false
                                                  //| (31,1) == (1,1) = false
                                                  //| (32,31) == (31,1) = false
                                                  //| (33,15) == (15,9) = false
                                                  //| (34,20)
                                                  //| Output exceeds cutoff limit.
  
  println(result)                                 //> 31626

}
/*
trait List[T] {
	def isEmpty: Boolean
	def head: T
	def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T]{
	def isEmpty = false
}

class Nil[T] extends List[T]{
	def isEmpty: Boolean = true
	def head: Nothing = throw new NoSuchElementException("Nil.head")
	def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}
*/