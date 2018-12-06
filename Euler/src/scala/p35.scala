object p35 extends App {
  def sieve(xs: List[Int]): List[Int] =
    if (xs.isEmpty)
      Nil
    else
      xs.head :: sieve(xs.tail.filter(_ % xs.head != 0))

  val primeList = sieve(Range(2, 1000).toList)
  println(primeList)
}