object p30 extends App {
  var sum = 0; var res = 0
  for (i <- 1 to 999999) {
    sum = 0
    val s = i.toString
    for ( j <- 0 until s.length){
      sum += Math.pow(s(j)-48,5).toInt
    }
    if (i == sum){
      res += i
      println(i)
    }
  }
  println(res)
}