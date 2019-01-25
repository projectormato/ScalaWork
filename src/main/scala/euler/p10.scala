object p10 extends App {
  var result:Long = 2; var flag = true
  for (i <- 3 to 2000000 by 2){
    flag = true
    for (j <- 3 to Math.sqrt(i).toInt by 2){
      if (i % j == 0) flag = false
    }
    if (flag) result += i
  }
  println(result)
}