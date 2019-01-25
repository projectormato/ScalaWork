object p36 extends App {
  var res = 0
  for (i <- 1 to 1000000) {
    if (i.toString == i.toString.reverse) {
      val two = i.toBinaryString
      if (two == two.reverse) {
        res += i
        println(i)
      }
    }
  }
  println(res)
}