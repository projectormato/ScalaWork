object p26 extends App {
  val d = 1/7.0; var s:String = null; var firstFlag:Boolean = true; var max = 0
  for (i <-1 to 1000){
    s = (1/i.toDouble).toString
    firstFlag = true
    for (j <- 4 until s.length-1){
      if (s(2) == s(j) && s(3) == s(j+1) && firstFlag){
        firstFlag = false
        max = List(max, j).max
//        println(j)
        if (j == 18) println(s, i)
      }
    }
  }
  println(max)
}