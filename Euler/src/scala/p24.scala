object p24 extends App {
  var num = 0; var target = 1000000; var n = 0
  for (i <- 9 to 1 by -1){
    n = 0
    num = (1 to i).product
    while (target >= num) {
      target -= num
      n += 1
    }
    print(n+1 + " ")
    // 3 7 7 3 6 2 3 3 1 0 → 2783915460
  }
  println(target)
}