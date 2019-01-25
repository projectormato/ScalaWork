object p29 extends App {
  var res: Set[String] = Set()
  for (i <- 2 to 100; j <- 2 to 100){
    val num = java.math.BigDecimal.valueOf(i).pow(j).toString
    res = res ++ Set(num)
  }
  println(res.size)
}
