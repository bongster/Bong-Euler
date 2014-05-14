package prob_17

object seventeen {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //0 - 9 name
  val FirstPosition: List[String] = List("one","two","three","four","five","six","seven","eight","nine");
                                                  //> FirstPosition  : List[String] = List(one, two, three, four, five, six, seven
                                                  //| , eight, nine)
  // 11 - 19  name
  val ExceptionPosition: List[String] = List("eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen")
                                                  //> ExceptionPosition  : List[String] = List(eleven, twelve, thirteen, fourteen,
                                                  //|  fifteen, sixteen, seventeen, eighteen, nineteen)
  // two degree position name
  val SecondPosition: List[String] = List("ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety")
                                                  //> SecondPosition  : List[String] = List(ten, twenty, thirty, forty, fifty, six
                                                  //| ty, seventy, eighty, ninety)

  // three degree position name
  val ThirdPosition: List[String] = FirstPosition map {n => n + " hundred"}
                                                  //> ThirdPosition  : List[String] = List(one hundred, two hundred, three hundred
                                                  //| , four hundred, five hundred, six hundred, seven hundred, eight hundred, nin
                                                  //| e hundred)
                                                  
  def NtoEConvertor(n: String, r: String = ""): String = {
  
 //n.toInt.toString.length because 09 is error
  	n.toInt.toString length match {
  		case 1 => r + FirstPosition(n.toInt -1)
  		case 2 if n.toInt == 10 =>	r + SecondPosition(0)
  		case 2 if n.toInt < 20 =>	r + ExceptionPosition((n.toInt % 10) - 1)
  		case 2 if n.toInt >= 20 && (n.toInt % 10 == 0) =>	r + SecondPosition((n.toInt / 10) - 1)
  		case 2 if n.toInt > 20 =>	NtoEConvertor(n.tail, r + SecondPosition(n.toInt / 10 - 1) + "-")
  		case 3 if n.toInt % 100 == 0 => ThirdPosition((n.toInt / 100) - 1)
  		case 3 => NtoEConvertor(n.tail, r + ThirdPosition((n.toInt / 100) - 1) + " and ")
  		case 4 => "one thousand"
  		case _ => r
  	}
  }                                               //> NtoEConvertor: (n: String, r: String)String
  
  
  10 / 10  -1                                     //> res0: Int = 0
 (1 to 1000).toList.par.foldLeft(0)((a, b) => a + NtoEConvertor(b.toString).replaceAll("""-| """, "").length)
                                                  //> res1: Int = 21124
 
 
  val nn = 890                                    //> nn  : Int = 890
  NtoEConvertor(nn toString)                      //> res2: String = eight hundred and ninety
  NtoEConvertor(nn toString).replaceAll("""-| """, "").length
                                                  //> res3: Int = 21
}