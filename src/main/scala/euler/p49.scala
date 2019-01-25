import scala.collection.mutable.ListBuffer

object p49 extends App {
  var primeList = ListBuffer[Int](2); var primeFlag = true

  // create prime list
  for (i <- 3 to 10000 by 2) {
    primeFlag = true
    for (j <- 3 to Math.sqrt(i).toInt by 2) {
      if (i % j == 0) primeFlag = false
    }
    if (primeFlag) primeList = primeList :+ i
  }

  var n = 0 //base
  for (i <- 1 to 4000) { //項差
    n = 1000
    while (n + i*2 < 10000) {
      if (n.toString.sorted == (n+i).toString.sorted && (n+i).toString.sorted == (n+i*2).toString.sorted) {
        if (primeList.contains(n) && primeList.contains(n+i) && primeList.contains(n+i*2)) {
          println(n, i, i+n, n+i*2)
        }
      }
      n += 1
    }
  }
}