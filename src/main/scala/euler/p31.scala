object p31 extends App {
  var res = 0
  for (i <- 0 to 2; j <- 0 to 4; k <- 0 to 10; l <- 0 to 20; m <- 0 to 40; n <- 0 to 100; o <- 0 to 200) {
    if (i*100 + j*50 + k*20 + l*10 + m*5 + n*2 + o == 200) res += 1
  }
  println(res)
}