import scala.collection.mutable.ListBuffer

object p50 extends App {
  var primeList = ListBuffer[Int](2); var primeFlag = true


  def isPrime (target: Int): Boolean = {
    val i = 997651
    for (j <- 3 to Math.sqrt(i).toInt by 2) {
      if (i % j == 0) primeFlag = false
    }
    if (primeFlag) println(i)
    
  }

  def func (a: Int): Unit = {
    println(a)
  }

  func(13)

//  // create prime list
//  for (i <- 3 to 1000000 by 2) {
//    primeFlag = true
//    for (j <- 3 to Math.sqrt(i).toInt by 2) {
//      if (i % j == 0) primeFlag = false
//    }
//    if (primeFlag) primeList = primeList :+ i
//  }
//
//  var res = 0; var sum = 0; var n = 0
//  for (i <- 0 to 10 ) {
//    sum = 0; n = i
//    while (1000000 > sum) {
//      sum += primeList(i)
//      if (primeList.contains(sum) && sum > res) res = sum
//      n += 1
//    }
//  }

}