package problem

import scala.collection.mutable.Map

import scala.collection.mutable.ArrayBuffer

object ex38 {
  println("No.38 어떤수에(1,2,...)를 곱해서 이어붙여 얻을수 있는 가장 큰 1 ~ 9 팬 디지털 숫자")
                                                  //> No.38 어떤수에(1,2,...)를 곱해서 이어붙여 얻을수 있는 가�
                                                  //| � 큰 1 ~ 9 팬 디지털 숫자
   
  9876 * 1                                        //> res0: Int(9876) = 9876
  9876 * 2                                        //> res1: Int(19752) = 19752
  9876.toString().distinct                        //> res2: String = 9876
  
  9 / 2.0                                         //> res3: Double(4.5) = 4.5
  Math.round((9 / 2).toDouble)                    //> res4: Long = 4
  Math.floor((9 / 2).toDouble)                    //> res5: Double = 4.0
  
	val f1 = (1 to Math.ceil(9 / 1.0).toInt).map(_ * 2).mkString("")
                                                  //> f1  : String = 24681012141618
	val f2 = ArrayBuffer(1,2,3,4,5,6,7,8,9)   //> f2  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5,
                                                  //|  6, 7, 8, 9)
   BigInt(10).pow(9 / 2)                          //> res6: scala.math.BigInt = 10000

	 
   BigInt(10).pow(9 / 5)                          //> res7: scala.math.BigInt = 10
   
  def check(n: Int): Boolean = {
  	
  	def pandigital(n: Int,r: String ="",count: Int): Boolean = {
  		if(r.size == 9 || count == 9) {
  				r.toString.distinct.size == r.toString.size
  		}
  		else if(r.size < 9){
  				pandigital(n, r + n * count, count + 1)
  		}else{
  			false
  		}
  	}
  	//get unique digit
  	if (!n.toString.contains("0") && n.toString.distinct.size == n.toString.size) {
			pandigital(n,count = 1)
  	}
  	else false
  }                                               //> check: (n: Int)Boolean
	val a = "7123456".toArray                 //> a  : Array[Char] = Array(7, 1, 2, 3, 4, 5, 6)
	scala.util.Sorting.quickSort(a)
	a.mkString("")                            //> res8: String = 1234567
	def getMax(a: Int, b: Int): Int = {
  	def pandigitalNum(n: Int,r: String ="",count: Int): Int = {
  		if(r.size == 9 && count > 1) {
  				val arr = r.toArray
  				scala.util.Sorting.quickSort(arr)
  				if(arr.mkString("") == "123456789") r.toInt else 0
  		}
  		else if(r.size < 9){
  				pandigitalNum(n, r + n * count, count + 1)
  		}else{
  			0
  		}
  	}
		Math.max(pandigitalNum(a,count = 1),pandigitalNum(b,count = 1))
	}                                         //> getMax: (a: Int, b: Int)Int
	
  val bong = (1 until 10000).foldLeft(0)((a, b ) => getMax(a,b))
                                                  //> bong  : Int = 932718654
  
 // val num = bong.foldLeft(0)((a,b) => getMax(a,b))
                                                  
 
                                                  
}