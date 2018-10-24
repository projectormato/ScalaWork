object p12 extends App {
  var sum:Long = 0; var divisor = 0; var ans:Long = 0;
  for (i <- 1 to 100000){
    sum += i
    for (j <- 1 to Math.sqrt(sum).toInt){
      if (sum % j == 0) divisor += 1
    }
    if (divisor*2 >= 500){
      if (ans == 0) ans = sum
    }else{
      divisor = 0
    }
  }
  println(ans)
}
