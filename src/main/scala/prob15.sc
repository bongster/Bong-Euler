package problem

object ex15 {
println("""
아래와 같은 2 × 2 격자의 왼쪽 위 모서리에서 출발하여
오른쪽 아래 모서리까지 도달하는 길은 모두 6가지.
그러면 20 × 20 격자에는 	모두 몇 개의 경로가?
""")                                              //> 
                                                  //| 아래와 같은 2 × 2 격자의 왼쪽 위 모서리에서 출발하여
                                                  //| 오른쪽 아래 모서리까지 도달하는 길은 모두 6가지.
                                                  //| 그러면 20 × 20 격자에는 	모두 몇 개의 경로가?
                                                  //| 

  // def bong(r: Int , c: Int): BigInt = {
  // val t = ((c + 1) to (r + c)).foldLeft[BigInt](1)((a, b) => a * b)
  // val d =  (1 to c).foldLeft[BigInt](1)((a, b) => a * b)
  //	println(t+","+ d)
  //	t / d
  //  }

  def bong(r: Int, c: Int): BigInt = ((c + 1) to (r + c)).foldLeft[BigInt](1)((a, b) => a * b) / (1 to c).foldLeft[BigInt](1)((a, b) => a * b)
                                                  //> bong: (r: Int, c: Int)BigInt
  bong(20, 20)                                    //> res0: BigInt = 137846528820

}