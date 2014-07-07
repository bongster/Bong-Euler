package main.scala

object prob28 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
 val a = for(a <- (2 to 100); b <- (2 to 100)) yield List(BigInt(a).pow(b),BigInt(b).pow(a))
                                                  //> a  : scala.collection.immutable.IndexedSeq[List[scala.math.BigInt]] = Vector
                                                  //| (List(4, 4), List(8, 9), List(16, 16), List(32, 25), List(64, 36), List(128,
                                                  //|  49), List(256, 64), List(512, 81), List(1024, 100), List(2048, 121), List(4
                                                  //| 096, 144), List(8192, 169), List(16384, 196), List(32768, 225), List(65536, 
                                                  //| 256), List(131072, 289), List(262144, 324), List(524288, 361), List(1048576,
                                                  //|  400), List(2097152, 441), List(4194304, 484), List(8388608, 529), List(1677
                                                  //| 7216, 576), List(33554432, 625), List(67108864, 676), List(134217728, 729), 
                                                  //| List(268435456, 784), List(536870912, 841), List(1073741824, 900), List(2147
                                                  //| 483648, 961), List(4294967296, 1024), List(8589934592, 1089), List(171798691
                                                  //| 84, 1156), List(34359738368, 1225), List(68719476736, 1296), List(1374389534
                                                  //| 72, 1369), List(274877906944, 1444), List(549755813888, 1521), List(10995116
                                                  //| 27776, 1600), List(2199023255552, 1681), List(4398046511104, 1764), List(879
                                                  //| 6093022208, 1849), List(
                                                  //| Output exceeds cutoff limit.
 (a.flatten toSet ).size                          //> res0: Int = 9183
}