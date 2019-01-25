object p48 extends App {
  var sum: Long = 0L; var now: Long = 0L
  for (i <- 1 to 1000){
    now = i
    for (j <- 2 to i){
      now *= i
      if (now.toString.length > 10){
        now = now.toString.substring(now.toString.length - 10).toLong
      }
    }
    println(now)
    sum += now
  }
  println(sum)
}