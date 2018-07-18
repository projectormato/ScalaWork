//object p2{
//  def a(): Unit ={
//    println("hello")
//  }
//  def main(args: Array[String]): Unit = {
//    a()
//  }
//}

object p2 {
  def main(args: Array[String]) :Unit = {
    var ans = 0
    for (i <- 0 until 1000) {
      if (i % 3 == 0 || i % 5 == 0) {
        ans += i
      }
    }
    println(ans)
  }
}
