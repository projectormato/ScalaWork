object p33 extends App {
  var resultBunsi = 1; var resultBunbo = 1
  for (i <- 10 to 99; j <- i+1 to 99){
    val bunsi = i.toString; val bunbo = j.toString
    for (k <- 0 to 1; l <- 0 to 1){
      if (bunsi(k) == bunbo(l)){
        val newBunsi = bunsi.diff(bunsi(k).toString).toInt
        val newBunbo = bunbo.diff(bunbo(l).toString).toInt
//        println(newBunsi, newBunbo)
        if (i/j.toDouble == newBunsi/newBunbo.toDouble && i%10 != 0){
          resultBunsi *= i
          resultBunbo *= j
          println(i, j)
        }
      }
    }
  }
  println(resultBunsi, resultBunbo)
}