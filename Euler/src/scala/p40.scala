object p40 extends App {
  var numSize:Int = 0; var res = 1; var num = 0
  for (i <- 1 to 6) {
    val target = Math.pow(10, i)
    while (target > numSize) {
      num += 1
      numSize += num.toString.length
    }
    println(num.toString.reverse.charAt(numSize - target.toInt))
    res *= num.toString.reverse.charAt(numSize - target.toInt)-48
//    println(num)
  }
  println(res)
}