import scala.io.StdIn

object A099 extends App {
  val N = StdIn.readLine().toInt
  println(if(1000 <= N) "ABD" else "ABC")
}