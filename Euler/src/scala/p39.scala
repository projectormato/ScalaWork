object p39 extends App {
  var res = 0; var max = 0
  for (i <- 120 to 1000) {
    var patern = 0
    for (j <- 1 to i/2) {
      for (k <- 1 to i/2) {
        val m = i - j - k
        if (Math.pow(j, 2) + Math.pow(k, 2) == Math.pow(m, 2)) patern += 1
      }
    }
    if (patern > max) {
      max = patern
      res = i
    }
    println(i, patern)
  }
  println(res, max)
}