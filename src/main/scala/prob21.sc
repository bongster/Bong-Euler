package main.scala

object prob21 {

	def nth[T](n: Int, xs: List[T]): T =
		if (xs.isEmpty) throw new IndexOutOfBoundsException
		else if(n == 0) xs.head
		else nth[T](n -1 , xs.tail)       //> nth: [T](n: Int, xs: main.scala.List[T])T
  
  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : main.scala.Cons[Int] = main.scala.Cons@8824ae2
  
  nth(2, list)                                    //> res0: Int = 3
  nth(-1, list)                                   //> java.lang.IndexOutOfBoundsException
                                                  //| 	at main.scala.prob21$$anonfun$main$1.nth$1(main.scala.prob21.scala:6)
                                                  //| 	at main.scala.prob21$$anonfun$main$1.apply$mcV$sp(main.scala.prob21.scal
                                                  //| a:13)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at main.scala.prob21$.main(main.scala.prob21.scala:3)
                                                  //| 	at main.scala.prob21.main(main.scala.prob21.scala)
  
}

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