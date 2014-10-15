package main.scala

import java.io.File

import scala.io.Source

/**
 * Created by bong on 2014-10-15.
 */
object Main extends App {

  val map: Map[Char, Option[Int]] = ('A' to 'Z').zipWithIndex.map(m => (m._1, Some(m._2 + 1))).toMap

  var memorize: Map[Int, Option[Boolean]] = Map()

  def triangle(sn: String): Int =
    if (sn.isEmpty)
      0
    else
      map.getOrElse(sn.head, None) match {
        case Some(n) => n + triangle(sn.tail)
        case None => triangle(sn.tail)
      }

  def solve(n: String): Boolean ={
    val triNum = triangle(n);
    checkTri(triNum)
  }

  def checkTri(tn : Int , n: Int = 1): Boolean = {
    if(tn == 1)
      true
    else if(tn / 2 < n)
      false
    else if(n * (n + 1) == tn * 2)
        true
    else
        checkTri(tn,n+1)
  }
//  def check(n: Int): Boolean = memorize.getOrElse(n, None) match {
//    case Some(b) => b
//    case None => {
//      if(n * 2 == (n  * (n + 1))){
//        memorize = memorize ++ Map(n -> Some(true))
//        true
//      }
//      else{
//        memorize = memorize ++ Map(n -> Some(false))
//        false
//      }
//    }
//  }

  val lines: List[String] = Source.fromFile(new File("words.txt")).getLines() toList
  val line = lines(0).split(',')

  val result = (for(l <- line) yield solve(l)) filter {n => n} length

  println(result)

//  line foreach { n =>
//    println(s"$n => ${triangle(n)} => ${solve(n)}")
//  }
}
