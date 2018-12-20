import scala.collection.mutable.ListBuffer

object p47 extends App {
  var primeList = ListBuffer[Int](2); var primeFlag = true

  // create prime list
  for (i <- 3 to 100000 by 2) {
    primeFlag = true
    for (j <- 3 to Math.sqrt(i).toInt by 2) {
      if (i % j == 0) primeFlag = false
    }
    if (primeFlag) primeList = primeList :+ i
  }
  println(primeList.length)

  var factorCount = ListBuffer[Int](0, 0, 0); var count = 0; var n = 0
  for (i <- 3 to 200000) {
    count = 0
    n = 0
    while (i > primeList(n)){
      if (i % primeList(n) == 0) count += 1
      n += 1
    }
    factorCount = factorCount :+ count //素因数の数を格納
    if (factorCount(i-3) == 4 && factorCount(i-2) == 4 && factorCount(i-1) == 4 && factorCount(i) == 4) println(i)
    if (i % 1000 == 0) println(i)

  }
  println(primeList)
}