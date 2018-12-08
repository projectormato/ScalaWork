object p37 extends App {
  def sieve(xs: List[Int]): List[Int] =
    if (xs.isEmpty)
      Nil
    else
      xs.head :: sieve(xs.tail.filter(_ % xs.head != 0))

  val primeList = sieve(Range(2, 10000).toList)

  var flag = true; var res = 0
  for (i <- 13 to 800000) {
    if (primeList.contains(i)){
      val target = i.toString
      flag = true
      for (j <- 1 until target.length){
        if (!primeList.contains(target.take(j).toInt) || !primeList.contains(target.reverse.take(j).toInt)) flag = false
      }
      if (flag) println(i)
    }
  }
  println(res) //5783
}