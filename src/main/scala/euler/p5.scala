object p5{
  def main(args: Array[String]): Unit = {
    // 素因数分解してそれぞれ最大の添字のやつでかける
    var factor:Array[Int] = Array.fill(20)(0)
    for (i <- 2 to 20){
      var now:Array[Int] = Array.fill(20)(0)
      var d = 2; var target = i
      while (target != 1){
        if (target % d == 0){
          now(d-1) += 1
          target /= d
        }else{
          d += 1
        }
      }
      println(i + ": ")
      for (j <- now.indices){
        factor(j) = Math.max(factor(j), now(j))
        print(now(j) + " ")
      }
      println()
    }

    var result:Int = 1
    for (i <-factor.indices){
      if (factor(i) != 0){
        println((i+1) + "is" + factor(i) + " ")
        result *= Math.pow((i+1).toDouble, factor(i).toDouble).toInt
      }
    }
    println(result)
  }
}