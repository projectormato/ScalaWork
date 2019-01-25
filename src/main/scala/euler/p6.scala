object p6 extends App {
  var sum1, sum2: Long = 0
  for (i <- 1 to 100){
    sum1 += Math.pow(i, 2).toLong
    sum2 += i
  }
  sum2 = Math.pow(sum2, 2).toLong
  println("sum of the squares: " + sum1 + ", square of the sum: " + sum2 + ", result: " + (sum2-sum1))
}