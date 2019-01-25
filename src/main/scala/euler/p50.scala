import scala.collection.mutable.ListBuffer

object p50 extends App {
  var primeList = ListBuffer[Int](2); var primeFlag = true

  // create prime list
  for (i <- 3 to 100000 by 2) {
    primeFlag = true
    for (j <- 3 to Math.sqrt(i).toInt by 2) {
      if (i % j == 0) primeFlag = false
    }
    if (primeFlag) primeList = primeList :+ i
  }

  // check prime
  def isPrime (target: Int): Boolean = {
    primeFlag = true
    if (target % 2 == 0) primeFlag = false
    for (i <- 3 to Math.sqrt(target).toInt by 2) {
      if (target % i == 0) primeFlag = false
    }
    if (primeFlag) {
      true
    }else {
      false
    }
  }

  var res = 0; var sum = 0; var n = 0; var count = 0; var max = 0
  for (i <- 0 to 10 ) {
    sum = 0; n = i; count = 0
    while (1000000 > sum + primeList(n)) {
      sum += primeList(n)
      count += 1
      if (isPrime(sum) && count > res) {
        res = count
        max = sum
      }
      n += 1
    }
    println(res, max)
  }

}