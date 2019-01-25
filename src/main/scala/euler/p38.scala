object p38 extends App {
  for (i <- 9999 to 8900 by -1) {
    var renketuseki = ""
    for (j <- 1 to 2) {
      renketuseki += (i * j).toString
    }
    if ("123456789" == renketuseki.sorted) println(renketuseki)
  }
}