package main.scala

object prob28 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  (1 to 5).toList.map(f => (1 to 5).toList)       //> res0: List[List[Int]] = List(List(1, 2, 3, 4, 5), List(1, 2, 3, 4, 5), List(
                                                  //| 1, 2, 3, 4, 5), List(1, 2, 3, 4, 5), List(1, 2, 3, 4, 5))
   
  Array.tabulate(5,5)( (x, y) => x + y)           //> res1: Array[Array[Int]] = Array(Array(0, 1, 2, 3, 4), Array(1, 2, 3, 4, 5), 
                                                  //| Array(2, 3, 4, 5, 6), Array(3, 4, 5, 6, 7), Array(4, 5, 6, 7, 8))
}