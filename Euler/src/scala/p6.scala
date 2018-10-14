object p6 extends App {
  var sum1: Long = 0;
  var sum2: Double = 0;
  var sum3: Long = 0;
  for (i <- 1 to 100){
    sum1 += Math.pow(i, 2).toLong;
    sum2 += i;
  }
  sum3 = Math.pow(sum2, 2).toLong;
  println(sum1)
  println(sum3)
  println(sum3 - sum1)
}