package main.scala

object prob31 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val moneyRange = List(1,2,5,10,20,50,100,200).sortWith(_ > _);
                                                  //> moneyRange  : List[Int] = List(200, 100, 50, 20, 10, 5, 2, 1)
  
  
  def solve31(money: Int, range: List[Int]): Int = {
  if(money == 0 ) 1
  else if(range.isEmpty) 0
  else if (range.head <=  money){
  	solve31(money - range.head, range) + solve31(money, range.tail)
  }else{
  	solve31(money, range.tail)
  }
  }                                               //> solve31: (money: Int, range: List[Int])Int
  
  solve31(200,moneyRange)                         //> res0: Int = 73682
}