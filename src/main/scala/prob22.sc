 val data = Source.fromFile("names.txt").getLines().mkString("").split(",").sortWith(_ < _);
    val dataSet = data.zipWithIndex
//    data foreach println
     val alphabat = ('A' to 'Z')

    val result = dataSet.foldLeft(0) {(a,n)=>
      val r = n._1.foldLeft(0)((o,p) => o + alphabat.indexOf(p) + 1)
      a + (r * (n._2 +1))
    }

    println(result)