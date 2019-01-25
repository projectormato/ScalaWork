object p41 extends App {
  val pand = "1234567"; var flag = true
  for (i <- 7777777 to 5000001 by -2) {
    if (i.toString.sorted == pand) {
//      println(i)
      flag = true
      for (j <- 3 to Math.sqrt(i).toInt by 2) {
        if (i % j == 0) {
          flag = false
        }
      }
      if (flag) println(i)
    }
  }
}